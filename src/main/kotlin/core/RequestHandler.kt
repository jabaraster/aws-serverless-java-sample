package core

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import sun.net.www.content.text.Generic

/**
 * Created by jabaraster.
 */
interface RequestHandler<REQ, RES> : RequestHandler<REQ, GenericResponse<RES>> {

    override fun handleRequest(body: REQ?, context: Context?): GenericResponse<RES>
}