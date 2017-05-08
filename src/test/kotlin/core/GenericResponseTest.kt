package core

import net.arnx.jsonic.JSON
import org.junit.Test

/**
 * Created by jabaraster.
 */
class GenericResponseTest {
    @Test fun test() {
        val s = JSON.encode(GenericResponse(201, "aaa"))
        println(s)
    }
}