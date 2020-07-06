package net.perfectdreams.mercadopago.response

import com.google.gson.annotations.SerializedName

class ErrorResponse(
        @SerializedName("message")
        val message: String? = null,
        @SerializedName("error")
        val error: String? = null,
        @SerializedName("status")
        val status: Int = 0
) : MercadoPagoResponse()