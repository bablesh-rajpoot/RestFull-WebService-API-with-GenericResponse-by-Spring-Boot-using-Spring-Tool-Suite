# RestFull-WebService-API-with-GenericResponse-by-Spring-Boot-using-Spring-Tool-Suite


1. !! Overview !!
In this example, we are creating RESTFULL Webservice API by Spring Boot using Spring Tool Suite (STS)and exposing them through REST APIs so that UI clients can invoke these operations. The demo operations enable the clients to modify the employee records in database.

2. !! Tools and technologies used !!

   Spring Boot - v2.2.6.RELEASE,
   JDK -         1.8 or later,
   Spring Framework - 5.1.2 RELEASE,
   Hibernate -   5.2.5. Final RELEASE,
   JPA      -    Spring-Data-Jpa 2.2.6.RELEASE,
   Maven    -     3.2+,
   IDE      -    Eclipse or Spring Tool Suite (STS)
   Database -    Mysql,Oracle
   Embeded-Server   -    Tomcat-annotation-api-9.0.33 Final RELEASE.

3.  !!Maven Dependencies (Using Pom.xml File) !!

In this example, we are using maven to add runtime jars in project.

4.  !! Hibernate Configuration (Using JPA Repository & Crud Repository) !!
  4.1. Entity and repository
The first step to work with data in database is to model it’s structure in JPA entity classes and create repository interfaces for them.

4.2. Datasource Configuration  (Using Application.properties file)
To connect to database, we must configure the datasource. We are using Mysql database so respective properties are used.


5. !! Service (uses repository) !!
The service layer is optional – still recommended to perform additional business logic if any. Generally, we will connect with repository here for crud operations.

6. !! REST Controller !!
Finally expose all operations through MVC URLs or REST endpoints. Clients will connect with these endpoints to get/update/delete employees records.

Notice the usage of annotations @RestController, @RequestMapping, @GetMapping, @PostMapping and @DeleteMapping to map various URIs to controller methods.





