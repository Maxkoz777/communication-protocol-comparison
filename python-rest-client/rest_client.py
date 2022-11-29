import requests


def make_request():
    return requests.post(
        url='http://127.0.0.1:8080/api/greeting',
        json={
            'name': 'Daniil',
            'hobbies': []
        }
    )


if __name__ == '__main__':
    response = make_request()
    print(response)
