package net.perfectdreams.mercadopago.response

import com.google.gson.annotations.SerializedName

data class CheckoutOAuth2Response(
        @SerializedName("access_token")
        val accessToken: String,
        @SerializedName("expires_in")
        val expiresIn: Int,
        @SerializedName("live_mode")
        val liveMode: Boolean,
        @SerializedName("refresh_token")
        val refreshToken: String,
        @SerializedName("scope")
        val scope: String,
        @SerializedName("token_type")
        val tokenType: String,
        @SerializedName("user_id")
        val userId: Int
)