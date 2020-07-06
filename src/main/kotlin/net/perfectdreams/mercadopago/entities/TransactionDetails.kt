package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class TransactionDetails(
        @SerializedName("acquirer_reference")
        val acquirerReference: Any,
        @SerializedName("external_resource_url")
        val externalResourceUrl: String,
        @SerializedName("financial_institution")
        val financialInstitution: Any,
        @SerializedName("installment_amount")
        val installmentAmount: Double,
        @SerializedName("net_received_amount")
        val netReceivedAmount: Double,
        @SerializedName("overpaid_amount")
        val overpaidAmount: Double,
        @SerializedName("payable_deferral_period")
        val payableDeferralPeriod: Any,
        @SerializedName("payment_method_reference_id")
        val paymentMethodReferenceId: String,
        @SerializedName("total_paid_amount")
        val totalPaidAmount: Double,
        @SerializedName("verification_code")
        val verificationCode: String
)