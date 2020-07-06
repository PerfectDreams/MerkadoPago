package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class Phone(
        @SerializedName("area_code")
        val areaCode: String,
        @SerializedName("extension")
        val extension: Any,
        @SerializedName("number")
        val number: String
)