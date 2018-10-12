
Observe the entries in application.properties file
Rest URLS :

GET  : http://localhost:9001/emp/employees/103
GET  : http://localhost:9001/emp/employees
GET  : http://localhost:9001/emp/employees/getemployeebyfirstname/ameya
POST : http://localhost:9001/employees --->This will have Json in body
PUT  : http://localhost:9001/employees/103--->this will have Json in body
DELETE : http://localhost:9001/employees/103

NOTE : Show the console for SQL queries
NOTE : Change the name of getByFirstNameIgnoreCase() to getByFirstName() in controller/service/serviceImpl/dao

rerun the code
and invoke GET  : http://localhost:9001/employees/getemployeebyfirstname/ameya

Observe the SQL on console :)

Swagger :
Add the dependencies in pom.xml update maven project
Code in the com.ameya.employee.SwaggerConfig class

URLS : 
http://localhost:9001/emp/v2/api-docs
http://localhost:8080/emp/swagger-ui.html

Actuator
Observe the entries from application.properties regarding actuator endpoints

http://localhost:9001/emp/actuator/health
http://localhost:9001/emp/actuator/beans
http://localhost:9001/emp/actuator/env

POST :

http://localhost:9001/emp/actuator/shutdown --->gracefully shutdown a service