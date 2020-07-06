package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class ExcludedPaymentType(
        @SerializedName("id")
        val id: String
)