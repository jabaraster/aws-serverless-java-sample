package core

import com.amazonaws.services.lambda.runtime.Context

/**
 * Created by jabaraster.
 */
abstract class BodyHandler<REQ, RES>(type: Class<REQ>) : RequestHandler<GenericRequest<REQ>, RES> {

    private val type = type

    override fun handleRequest(body: GenericRequest<REQ>?, context: Context?): GenericResponse<RES> {
        val request = body!!.getRequest(type)
        return this.process(request, context!!)
    }

    abstract protected fun process(body: REQ, context: Context): GenericResponse<RES>
}