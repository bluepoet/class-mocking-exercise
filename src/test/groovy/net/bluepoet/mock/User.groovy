package net.bluepoet.mock

/**
 * Created by bluepoet on 2016. 11. 29..
 */
class User {
    String name

    User(String name) {
        this.name = name
    }

    def hello() {
        return this.name + " hello"
    }
}
