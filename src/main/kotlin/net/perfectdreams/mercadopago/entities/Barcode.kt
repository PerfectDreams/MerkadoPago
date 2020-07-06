package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class Barcode(
        @SerializedName("content")
        val content: String,
        @SerializedName("height")
        val height: Any,
        @SerializedName("type")
        val type: Any,
        @SerializedName("width")
        val width: Any
)