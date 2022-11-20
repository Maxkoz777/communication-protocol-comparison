import grpc

import greeting_service_pb2_grpc
import greeting_service_pb2


def run():
    with grpc.insecure_channel('127.0.0.1:9090') as channel:
        stub = greeting_service_pb2_grpc.GreetingServiceStub(channel)
        response = stub.greeting(greeting_service_pb2.HelloRequest(name='Daniil'))
    print(response)


if __name__ == '__main__':
    run()
