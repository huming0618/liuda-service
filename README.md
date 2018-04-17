
### Reference
- Spring Boot - https://projects.spring.io/spring-boot/
- To create the gradle - https://start.spring.io/
- How to access the data - https://auth0.com/blog/integrating-spring-data-jpa-postgresql-liquibase/

### Run the application for development 
###### To sttart the dockerized postsql 
`docker run --name liuda-db -p 5432:5432 -e POSTGRES_DB=liuda -e POSTGRES_PASSWORD=liuda -d postgres`
###### To run the psql against the database
`docker exec -ti liuda-db psql -U postgres`
###### To run the application
- To build: `gradle build`
- To run: `gradle bootRun`