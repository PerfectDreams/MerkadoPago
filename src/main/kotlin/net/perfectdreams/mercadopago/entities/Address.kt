package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class Address(
        @SerializedName("street_name")
        val streetName: String,
        @SerializedName("street_number")
        val streetNumber: Int,
        @SerializedName("zip_code")
        val zipCode: String
)