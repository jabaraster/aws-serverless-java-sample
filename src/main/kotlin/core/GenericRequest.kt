package core

import net.arnx.jsonic.JSON

/**
 * Created by jabaraster.
 */
data class GenericRequest<REQ>(var body: String) {
    constructor() : this("")
    fun getRequest(type: Class<REQ>): REQ {
        return JSON.decode(this.body, type)
    }
}