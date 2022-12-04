import requests
import json

from pytools.measure_time_tool import timeit


HOST = 'http://127.0.0.1'
PORT = 8080
ADDR = ':'.join([HOST, str(PORT)])


@timeit
def test_heavy_payload_list_rest():
    response = requests.post(
        url=f'{ADDR}/api/heavy/list',
        json={
            'strings': ['Daniil', 'Hi!'],
            'longs': [12345, 4321],
            'doubles': [1.01, 2.002],
            'booleans': [True, False],
        }
    )
    json.loads(response.content.decode())
    print(f'Working on response..')


@timeit
def test_heavy_payload_rest():
    response = requests.post(
        url=f'{ADDR}/api/heavy',
        json={
            'strings': ['Daniil', 'Hi!'],
            'longs': [12345, 4321],
            'doubles': [1.01, 2.002],
            'booleans': [True, False],
        }
    )
    json.loads(response.content.decode())
    print(f'Working on response..')


@timeit
def test_long_computation_rest():
    response = requests.post(
        url=f'{ADDR}/api/long',
        json={
            'name': 'Daniil',
            'hobbies': ['hEllo']
        }
    )
    json.loads(response.content.decode())
    print(f'Working on response..')


@timeit
def test_greeting_rest():
    response = requests.post(
        url=f'{ADDR}/api/greeting',
        json={
            'name': 'Daniil',
            'hobbies': ['hEllo']
        }
    )
    json.loads(response.content.decode())
    print(f'Working on response..')
