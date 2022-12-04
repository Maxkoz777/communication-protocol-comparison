import grpc

from python_grpc_client.greeting_service_pb2_grpc import GreetingServiceStub
import python_grpc_client.greeting_service_pb2 as service

from pytools.measure_time_tool import timeit


HOST = '127.0.0.1'
PORT = 9090
ADDR = ':'.join([HOST, str(PORT)])


@timeit
def test_heavy_payload_list_grpc():
    with grpc.insecure_channel(ADDR) as channel:
        stub = GreetingServiceStub(channel)
        response = stub.heavyPayloadList(
            service.EnormousDTO(
                strings=['Daniil', 'Hi!'],
                longs=[12345, 4321],
                doubles=[1.01, 2.002],
                booleans=[True, False],
            )
        )
        for i, res in enumerate(response):
            if i % 10 == 0:
                print(f'Working in {i}th response..')


@timeit
def test_heavy_payload_grpc():
    with grpc.insecure_channel(ADDR) as channel:
        stub = GreetingServiceStub(channel)
        _ = stub.heavyPayload(
            service.EnormousDTO(
                strings=['Daniil', 'Hi!'],
                longs=[12345, 4321],
                doubles=[1.01, 2.002],
                booleans=[True, False],
            )
        )
        print(f'Working on response..')


@timeit
def test_long_computation_grpc():
    with grpc.insecure_channel(ADDR) as channel:
        stub = GreetingServiceStub(channel)
        _ = stub.longComputation(
            service.HelloRequest(
                name='Daniil',
                hobbies=['12345', '4321'],
            )
        )
        print(f'Working on response..')


@timeit
def test_greeting_grpc():
    with grpc.insecure_channel(ADDR) as channel:
        stub = GreetingServiceStub(channel)
        _ = stub.greeting(
            service.HelloRequest(
                name='Daniil',
                hobbies=['12345', '4321'],
            )
        )
        print(f'Working on response..')
