package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

class Identification(
        @SerializedName("number")
        val number: String,
        @SerializedName("type")
        val type: String
)