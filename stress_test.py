from pytools.measure_time_tool import timeit
from python_grpc_client.grpc_client import test_heavy_payload_list_grpc, \
    test_heavy_payload_grpc, test_greeting_grpc, test_long_computation_grpc
from python_rest_client.rest_client import test_heavy_payload_list_rest, \
    test_heavy_payload_rest, test_greeting_rest, test_long_computation_rest

import numpy as np
import scipy.stats as st
import pandas as pd


@timeit
def stress_test(method, iterations):
    execution_times = []
    for i in range(iterations):
        _, execution_time = method()
        execution_times.append(execution_time)
    return st.t.interval(
        confidence=0.9,
        df=len(execution_times) - 1,
        loc=np.mean(execution_times),
        scale=st.sem(execution_times)
    )[0]


if __name__ == '__main__':
    methods = {
        'test_heavy_payload': (test_heavy_payload_rest, test_heavy_payload_grpc),
        # 'test_heavy_payload_list': (test_heavy_payload_list_rest, test_heavy_payload_list_grpc),
        'test_greeting': (test_greeting_rest, test_greeting_grpc),
        'test_long_computation': (test_long_computation_rest, test_long_computation_grpc),
    }
    results = {
        'name': [],
        'conf_rest': [],
        'conf_grpc': []
    }
    for name, rest_grpc in methods.items():
        results['name'].append(name)
        results['conf_rest'].append(stress_test(
            method=rest_grpc[0],
            iterations=100
        ))
        results['conf_grpc'].append(stress_test(
            method=rest_grpc[1],
            iterations=100
        ))
    df = pd.DataFrame(results)
    df.to_csv('comparison.csv')
