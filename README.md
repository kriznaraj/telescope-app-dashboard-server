# telescope-app-dashboard-server
Telescope app service for dashboard

Local setup

1/ Start the KeyClock server in a docker container

```
docker run -p 8090:8080 -e KEYCLOAK_ADMIN=admin -e KEYCLOAK_ADMIN_PASSWORD=admin quay.io/keycloak/keycloak:17.0.0 start-dev
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

5/ To remove the container

```
docker-compose down
```

6/ To test

```
curl --location --request GET 'http://localhost:8080/hello/user' \
--header 'Authorization: Bearer <Auth-Token>' 
```

