package net.perfectdreams.mercadopago.response

import com.google.gson.annotations.SerializedName
import net.perfectdreams.mercadopago.entities.BackUrls
import net.perfectdreams.mercadopago.entities.Item
import net.perfectdreams.mercadopago.entities.PaymentMethods
import net.perfectdreams.mercadopago.entities.PaymentSettings

data class PaymentSettingsResponse(
        @SerializedName("additional_info")
        val additionalInfo: String,
        @SerializedName("auto_return")
        val autoReturn: String,
        @SerializedName("back_urls")
        val backUrls: BackUrls,
        @SerializedName("binary_mode")
        val binaryMode: Boolean,
        @SerializedName("client_id")
        val clientId: String,
        @SerializedName("collector_id")
        val collectorId: Int,
        @SerializedName("date_created")
        val dateCreated: String,
        @SerializedName("expiration_date_from")
        val expirationDateFrom: Any,
        @SerializedName("expiration_date_to")
        val expirationDateTo: Any,
        @SerializedName("expires")
        val expires: Boolean,
        @SerializedName("external_reference")
        val externalReference: String,
        @SerializedName("id")
        val id: String,
        @SerializedName("init_point")
        val initPoint: String,
        @SerializedName("items")
        val items: List<Item>,
        @SerializedName("marketplace")
        val marketplace: String,
        @SerializedName("marketplace_fee")
        val marketplaceFee: Int,
        @SerializedName("notification_url")
        val notificationUrl: Any,
        @SerializedName("operation_type")
        val operationType: String,
        @SerializedName("payer")
        val payer: PaymentSettings.Payer,
        @SerializedName("payment_methods")
        val paymentMethods: PaymentMethods,
        @SerializedName("processing_modes")
        val processingModes: List<Any>,
        @SerializedName("sandbox_init_point")
        val sandboxInitPoint: String/* ,
        @SerializedName("shipments")
        val shipments: Shipments */
)