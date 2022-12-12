# Docker

https://spring.io/guides/topicals/spring-boot-docker/

aws user apps: awsapprunner-admin
---
docker build -t ktor-aws-runner .
----
docker build -t kotlinspring2 .

docker run -p 8080:8080 kotlinspring2

console into
docker run -ti --entrypoint kotlinspring2

docker run -p 8080:8080 -d toregard/fluxtesting:1.0

docker run -p 8080:8080 -it toregard/fluxtesting:1.0
