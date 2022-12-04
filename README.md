# Communication Protocols


## How to test gRPC:

1. Install `requirements.txt` from root folder (`communication-protocol-comparison`):
`pip install -r requirements.txt`

2. Move to `java-grpc-server` folder:
`cd java-grpc-server`

3. Install `java` and `mvn` using the following tutorial:
`https://www.digitalocean.com/community/tutorials/install-maven-mac-os`

4. Run server: 
`mvn package`
`java -jar target/java-grpc-server-1.0-SNAPSHOT.jar`

5. Run python client from `communication-protocol-comparison` folder:
`python stress_test.py`


## How to test REST:

1. Install `requirements.txt` from root folder (`communication-protocol-comparison`):
`pip install -r requirements.txt`

2. Move to `java-rest-server` folder:
`cd java-rest-server`

3. Install `java` and `mvn` using the following tutorial:
`https://www.digitalocean.com/community/tutorials/install-maven-mac-os`

4. Run server: 
`./mvnw spring-boot:run`

5. Run python client from `communication-protocol-comparison` folder:
`python stress_test.py`


