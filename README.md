# Grails 4 - Access Local Resource

This is an example Grails 4 web application which access a local JSON file from the controller.

## Steps To Verify

1. Please check [GreetingsController.groovy](grails-app/controllers/com/objectcomputing/example/GreetingsController.groovy).
2. The local JSON file is in [/src/main/resources/greetings.json](src/main/resources/greetings.json).
3. Run the application using `./gradlew bootRun`
4. Goto [localhost:8080/greetings](http://localhost:8080/greetings), you should see the following:
```json
{
    "message": "Greetings, It works!"
}
```

