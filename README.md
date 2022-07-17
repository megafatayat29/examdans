Nostra Movie
---------------------

* Introduction
* Requirements
* Installation
* Configuration
* Maintainers

INTRODUCTION
------------

Nostra Movie is a streaming service that offers a wide variety of award-winning TV shows, movies, anime, documentaries, and more on thousands of internet-connected devices.

A producer can register himself in this application, and he can register the movies he produces.

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

####Producer
1. GET
* Get All Producers 

``GET: http://localhost:8081/producers``

  => This API returns all producers. 

* Get Producer By Id

``GET: http://localhost:8081/producer/{id}``

=> This API returns Producer entity with given id.

2. POST
* Register Producer

``POST: http://localhost:8081/producer``

  => This API returns the Producer entity that was created. Need RequestBody of Producer without id.

####
Request body:

```json
{
  "founder": "Dhamoo Punjabi, Manoj Punjabi",
  "name": "MD Pictures",
  "yearFounded": "2006-12-07"
}
```

3. PUT
* Update Producer

  ``PUT: http://localhost:8081/producer``

  => This API returns the Producer entity that was updated. Need RequestBody of Producer with id.

####
Request body:

```json
{
  "id": "4028e4e77de5de19017de5df48bd0000",
  "founder": "Dhamoo Punjabi, Manoj Punjabi, EDITED",
  "name": "MD Pictures",
  "yearFounded": "2006-12-07"
}
```

4. DELETE
* Delete Producer By Id

  ``DELETE: http://localhost:8081/producer?id=value``

  => This API returns void, and need RequestParam String id of Producer you want to delete.

####Movie
1. POST
* Create Movie 

``POST: http://localhost:8081/movie``

  => This API returns the Movie entity that was created. Need RequestBody of Movie without id.

####
Request body:

```json
{
  "actor": "Reza Rahadian, Putri Marino, Anya Geraldine",
  "description": "Reza Rahadian Reza Rahadian Reza Rahadian Reza Rahadian Reza Rahadian",
  "director": "Manoj Punjabi",
  "duration": 120,
  "genre": "Drama",
  "name": "Layangan Putus",
  "producerId": "4028e4e77de5de19017de5df48bd0000"
}
```

2. GET
* Get All Movies

``GET: http://localhost:8081/movies``

=> This API returns all movies.

* Get Producer By Id

``GET: http://localhost:8081/movie/{id}``

=> This API returns Movie entity with given id.

* Get Movie By Criteria

``GET: http://localhost:8081/movies/criteria?size=3&page=0``

=> This API returns all Movie entity with given criteria. You can optionally add the RequestParam dynamic search attribute. This endpoint is equipped with a pagination feature, so it requires a page and the size of the RequestParam.

Example:
For example, you are looking for a movie with a director containing the word Manoj:

``GET: http://localhost:8081/movies/criteria?director=Manoj&size=3&page=0``

3. PUT
* Update Movie

  ``PUT: http://localhost:8081/movie``

  => This API returns the Movie entity that was updated. Need RequestBody of Movie with id.

####
Request body:

```json
{
  "id": "402876507de5f22f017de5f3a1930000",
  "actor": "Reza Rahadian, Putri Marino, Anya Geraldine",
  "description": "Reza Rahadian Reza Rahadian Reza Rahadian Reza Rahadian Reza Rahadian",
  "director": "Manoj Punjabi",
  "duration": 120,
  "genre": "Drama",
  "name": "Layangan Putus",
  "producerId": "4028e4e77de5de19017de5df48bd0000"
}
```

4. DELETE
* Delete Movie By Id

  ``DELETE: http://localhost:8081/movie?id=value``

  => This API returns void, and need RequestParam String id of Movie you want to delete.

## Support

Further information email me : [megafatayat9@gmail.com]()

## License

[Apache Software Foundation](https://www.apache.org/licenses/LICENSE-2.0)