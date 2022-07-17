Exam Dans
---------------------

* Introduction
* Requirements
* Installation
* Configuration
* Maintainers

INTRODUCTION
------------

Exam Dans is a backend data protection application developed using Java Spring Boot, using JWT Authentication.

## Prerequisites

* [Oracle JDK 17](https://docs.oracle.com/en/java/javase/17/)
* [Maven](https://maven.apache.org/)
* [PostgreSQL](https://www.postgresql.org/)
* [SpringBoot 2.5.8](https://docs.spring.io/spring-boot/docs/2.5.8/reference/html/)

## Installation

Use the package manager [maven](https://maven.apache.org/) to install and build Nostra Movie app.

```bash
mvn clean install
```

running apps

```bash
java -jar target/nostramovie-0.0.1-SNAPSHOT.jar
```

## API

####Account
1. POST
* Register An Account

``POST: http://localhost:8082/register``

####
Request body:

```json
{
    "name": "Boyce Avenue",
    "email": "boyce@avenue.com",
    "username": "boyce",
    "password": "12345678"
}
```

  => This API for register an account for access the content. 

* Sign In an Account

``POST: http://localhost:8082/signIn``

####
Request body:

```json
{
    "username": "boyce",
    "password": "12345678"
}
```

  => This API for sign in an account for access the content. 

####Job
1. GET
* Get All Job

``GET: http://localhost:8082/jobs``

  => This API returns all the jobs in API http://dev3.dansmultipro.co.id/api/recruitment/positions.json, with authentication JWT security.

* Get Job By Id

``GET: http://localhost:8082/job/{id}``

=> This API returns a job entity with selected id.

## Support

Further information email me : [megafatayat9@gmail.com]()

## License

[Apache Software Foundation](https://www.apache.org/licenses/LICENSE-2.0)
