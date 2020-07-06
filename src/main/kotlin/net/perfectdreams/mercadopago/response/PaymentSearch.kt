package net.perfectdreams.mercadopago.response

import com.google.gson.annotations.SerializedName
import net.perfectdreams.mercadopago.entities.Paging
import net.perfectdreams.mercadopago.entities.Payment

data class PaymentSearch(
        @SerializedName("paging")
        val paging: Paging,
        @SerializedName("results")
        val results: List<Payment>
)