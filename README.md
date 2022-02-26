
#Telescope app service for dashboard

##Local setup

1/ Start the KeyClock server in a docker container

```
docker-compose -f keycloak-docker-compose.yml up
```

2/ Build the spring boot app

```
./mvnw clean package -DskipTests
```

3/ Build the docker spring boot app as a docker image

```
docker-compose build
```

4/ Start the application container

```
docker-compose up
```

5/ Check running containers

```
docker container ls
```

6/ To test it in local, add host entry as follows.

```
vim /etc/hosts
127.0.0.1 keycloak
```

7/ Get access token from keycloak service

```
curl --location --request POST 'http://keycloak:8080/auth/realms/telescope/protocol/openid-connect/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'client_id=login-app' \
--data-urlencode 'username=<user-name>' \
--data-urlencode 'password=<password>' \
--data-urlencode 'grant_type=password'
```

8/ Access the Telescope app service using the access token

```
curl --location --request GET 'http://localhost:8090/dashboard/companies' \
--header 'Authorization: Bearer <ACCESS_TOKEN>'
```

9/ To remove the container

```
docker-compose down
docker-compose -f keycloak-docker-compose.yml down
```

