package app.hello

import net.arnx.jsonic.JSON
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by jabaraster.
 */
class PostRequestTest {
    @Test fun test() {
        val src = PostRequest("hoge", 120)
        val json = JSON.encode(src)
        println(json)
        assertEquals(src, JSON.decode(json, PostRequest::class.java))
    }
}