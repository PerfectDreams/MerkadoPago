package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class ExcludedPaymentMethod(
        @SerializedName("id")
        val id: String
)