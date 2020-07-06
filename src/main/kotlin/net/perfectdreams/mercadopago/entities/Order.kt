package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class Order(
        @SerializedName("id")
        val id: String,
        @SerializedName("type")
        val type: String
)