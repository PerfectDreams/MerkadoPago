package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class Paging(
        @SerializedName("limit")
        val limit: Int,
        @SerializedName("offset")
        val offset: Int,
        @SerializedName("total")
        val total: Int
)