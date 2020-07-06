package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class PaymentSettings(
        @SerializedName("items")
        val items: List<Item>,

        @SerializedName("auto_return")
        val autoReturn: String? = null,
        @SerializedName("back_urls")
        val backUrls: BackUrls? = null,
        @SerializedName("expiration_date_from")
        val expirationDateFrom: String? = null,
        @SerializedName("expiration_date_to")
        val expirationDateTo: String? = null,
        @SerializedName("expires")
        val expires: Boolean? = null,
        @SerializedName("external_reference")
        val externalReference: String? = null,
        @SerializedName("notification_url")
        val notificationUrl: String? = null,
        @SerializedName("payer")
        val payer: Payer? = null,
        @SerializedName("payment_methods")
        val paymentMethods: PaymentMethods? = null,
        @SerializedName("shipments")
        val shipments: Shipments? = null
) {
        data class Payer(
                @SerializedName("address")
                val address: Address? = null,
                @SerializedName("date_created")
                val dateCreated: String? = null,
                @SerializedName("email")
                val email: String? = null,
                @SerializedName("identification")
                val identification: Identification? = null,
                @SerializedName("name")
                val firstName: String? = null,
                @SerializedName("phone")
                val phone: Phone? = null,
                @SerializedName("surname")
                val lastName: String? = null
        )
}