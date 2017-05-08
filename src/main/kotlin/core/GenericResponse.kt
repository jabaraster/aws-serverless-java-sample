package core

import net.arnx.jsonic.JSON

/**
 * Created by jabaraster.
 */
class GenericResponse<RES>(statusCode: Int, body: RES) {
    val statusCode = statusCode
    val body = JSON.encode(body)
    val headers = emptyMap<String, String>()
}