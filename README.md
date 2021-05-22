## Instagram Clone
- Live: https://jkasper-instagram-spring.herokuapp.com/ (be patient, server is sleeping)

[![Product Name Screen Shot][product-screenshot]](https://github.com/jannkasper/instagram-react/blob/master/video.gif)

## :rocket: Tech Stack

- Spring Boot
- Rest Template
- Thymeleaf
- H2
- Lombok
- JUnit

## :warning: Prerequisite

- JDK 1.8 or later
- Maven 3.2+

## :cd: How to run local

```bash
# Clone this repository
$ git clone https://github.com/jannkasper/instagram-spring

# Set <your-cookie> in application.properties
# Find instruction below

# Go into project
$ cd instagram-spring

# Run goal for the Unix system
$ ./mvnw clean install

# Run our Spring-Boot project
$ ./mvnw spring-boot:run
```
Find your-cookie: Login to Instagram > DevTools (F12) > Network > Any Request -> Request Headers > cookie: <your-cookie>

## :mag_right: Testing

```bash
$ cd instagram-spring
$ ./mvnw test
```

## :globe_with_meridians: Deploy

#### Deploying Server App on Heroku
- Login to Instagram > DevTools (F12) > Network > Any Request -> Request Headers > cookie: <your-cookie>
- Create a [Heroku](https://dashboard.heroku.com/new-app) new app.
- Go to app settings
- Add the following enviroments.
    - INSTAGRAM_COOKIE (to use your Instagram connection)
- Add Nodejs to buildpacks

-
```bash
# Go into the repository
$ cd instagram-react

# Heroku Setup
$ npm install -g heroku
$ heroku login
$ heroku git:remote -a your-app-name

# push the repository
$ git push heroku master
```


## :book: Directory Structure

```
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       ├── api/
│   │   │       │   ├── mapper/
│   │   │       │   └── model/
│   │   │       ├── config/
│   │   │       ├── controllers/
│   │   │       ├── domain/
│   │   │       ├── services/
│   │   │       ├── util/
│   │   │       ├── InstagramSpringApplication.java
│   │   │       └── ServletInitializer.java
│   │   │ 
│   │   └── resources/
│   │       ├── static/
│   │       ├── templates/
│   │       ├── application.example.properties
│   │       └── application.properties
│   │ 
│   └── test/
│       └── java/
│           └── com/
│               ├── controllers/
│               ├── domain/
│               ├── mappers/
│               ├── services/
│               ├── utils/
│               └── InstagramSpringApplicationTests.java
│        
├── pom.xml
 
```

## :memo: License

This project is made available under the MIT License.





<!-- MARKDOWN LINKS & IMAGES -->
[product-screenshot]: video.gif