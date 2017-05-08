package app.hello

/**
 * Created by jabaraster.
 */
data class PostRequest(var key1: String, var key2: Int) {
    constructor() : this("", Int.MIN_VALUE)
}