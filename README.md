# Comicbase

## About Comicbase

Comicbase is a fun project to learn more about developing apps using [Spring Boot](http://projects.spring.io/spring-boot/) and Java 8. Eventually there may also be equivalent versions of this app in JavaScript, Ruby, or even Python.

## What is it?

Comicbase is a REST API that models comic book characters from the Marvel (and perhaps eventually DC) universe. Each character is classified as either a `Hero` or a `Villain` and all characters have an associated `PowerGrid` that assesses their skill level and a collection of their abilities.

## Are you just making this up?

Nope! The data used in this app is based off of the [Marvel Wiki](http://marvel.wikia.com) where these abilities and power levels are already defined. This data source was picked because I am a big fan of comic books (Marvel in particular) and thought it would be a fun exercise to model some of this information.

## Running Comicbase

Comicbase requires Java 8 and Maven to run. After installing and cloning the repository, you can start up the app locally with Maven:

    $ mvn spring-boot:run

which spins up a local webserver that you can access via `http://localhost:8080/`.

## License

Licensed under the [MIT](LICENSE) License. Have at it.
