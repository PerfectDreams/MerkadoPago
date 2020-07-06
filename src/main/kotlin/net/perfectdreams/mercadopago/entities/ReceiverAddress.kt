package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class ReceiverAddress(
        @SerializedName("apartment")
        val apartment: String,
        @SerializedName("floor")
        val floor: Int,
        @SerializedName("street_name")
        val streetName: String,
        @SerializedName("street_number")
        val streetNumber: Int,
        @SerializedName("zip_code")
        val zipCode: String
)