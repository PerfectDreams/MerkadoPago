package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class Item(
        @SerializedName("title")
        val title: String,
        @SerializedName("quantity")
        val quantity: Int,
        @SerializedName("currency_id")
        val currencyId: String,
        @SerializedName("unit_price")
        val unitPrice: Float,

        @SerializedName("category_id")
        val categoryId: String? = null,
        @SerializedName("description")
        val description: String? = null,
        @SerializedName("id")
        val id: String? = null,
        @SerializedName("picture_url")
        val pictureUrl: String? = null
)