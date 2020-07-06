package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class BackUrls(
        @SerializedName("failure")
        val failure: String,
        @SerializedName("pending")
        val pending: String,
        @SerializedName("success")
        val success: String
)