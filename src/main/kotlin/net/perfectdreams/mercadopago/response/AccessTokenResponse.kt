package net.perfectdreams.mercadopago.response

import com.google.gson.annotations.SerializedName

class AccessTokenResponse(
        @SerializedName("access_token")
        val accessToken: String,
        @SerializedName("refresh_token")
        val refreshToken: String,
        @SerializedName("live_mode")
        val liveMode: Boolean = false,
        @SerializedName("user_id")
        val userId: Int = 0,
        @SerializedName("token_type")
        val tokenType: String? = null,
        @SerializedName("expires_in")
        val expiresIn: Int = 0,
        @SerializedName("scope")
        val scope: String? = null
) : MercadoPagoResponse()