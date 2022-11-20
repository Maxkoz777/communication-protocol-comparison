import requests


def make_request():
    return requests.get(
        url='https://localhost:9090/api/greeting',
        params={
            'name': 'Daniil',
            'hobbies': []
        }
    )


if __name__ == '__main__':
    response = make_request()
    print(response)
