package app.hello

import com.amazonaws.services.lambda.runtime.Context
import core.GenericResponse
import core.RequestHandler

/**
 * Created by jabaraster.
 */
class Get : RequestHandler<Void, String> {
    override fun handleRequest(body: Void?, context: Context?): GenericResponse<String> {
        return GenericResponse(200, "Hello!!")
    }
}