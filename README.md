<br />
<div align="center">
<h3 align="center">PRAGMA POWER-UP USER-MICRO-SERVICE</h3>
  <p align="center">
    In this challenge you are going to design the backend of a system that centralizes the services and orders of a restaurant chain that has different branches in the city.
  </p>
</div>

### Built With

* ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
* ![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
* ![Gradle](https://img.shields.io/badge/Gradle-02303A.svg?style=for-the-badge&logo=Gradle&logoColor=white)
* ![MySQL](https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white)


<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running follow these steps.

### Prerequisites

* JDK 17 [https://jdk.java.net/java-se-ri/17](https://jdk.java.net/java-se-ri/17)
* Gradle [https://gradle.org/install/](https://gradle.org/install/)
* MySQL [https://dev.mysql.com/downloads/installer/](https://dev.mysql.com/downloads/installer/)

### Recommended Tools
* IntelliJ Community [https://www.jetbrains.com/idea/download/](https://www.jetbrains.com/idea/download/)
* Postman [https://www.postman.com/downloads/](https://www.postman.com/downloads/)

### Installation

1. Clone the repository or download the project .zip
2. Change directory
   ```sh
   cd power-up-micro-users
   ```
   or unzip the zip file and open it with intellij IDEA
3. Create a new database in MySQL called powerup_user
4. Update the database connection settings and remember your database port, in this case it is 3306
   ```yml
   # src/main/resources/application-dev.yml
   spring:
      datasource:
          url: jdbc:mysql://localhost:3306/powerup_user
          username: <your-userName>
          password: <your-password>
      jpa:
        hibernate:
          ddl-auto: create
        defer-datasource-initialization: true
      sql:
        init:
          mode: always
   ```
5. With the above configuration, the data is automatically added to the corresponding tables, otherwise, after creating the tables, 
   run src/main/resources/data.sql content to complete the database setup.
6. Open Swagger UI and search the /auth/login endpoint and login with gmail: email@some.com, password: 1234 for the admin user or 
   if you want to use a owner user put gmail: email2@some.com, password: 1234

<!-- USAGE -->
## Usage

1. Right-click the class PowerUpApplication and choose Run
2. Open [http://localhost:8090/swagger-ui/index.html](http://localhost:8090/swagger-ui/index.html) in your web browser

<!-- ROADMAP -->
## Tests

- Right-click the test folder and choose Run tests with coverage
