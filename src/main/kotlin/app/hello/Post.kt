package app.hello

import com.amazonaws.services.lambda.runtime.Context
import core.GenericResponse
import core.BodyHandler

/**
 * Created by jabaraster.
 */
class Post : BodyHandler<PostRequest, PostResponse>(PostRequest::class.java) {
    override fun process(body: PostRequest, context: Context): GenericResponse<PostResponse> {
        return GenericResponse(200, PostResponse(request = body))
    }
}