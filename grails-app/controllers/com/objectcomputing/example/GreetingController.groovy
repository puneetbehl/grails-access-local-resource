package com.objectcomputing.example

class GreetingsController {

    def index() {
        URL url = getClass().getResource("/greetings.json")
        render url.text
    }
}
