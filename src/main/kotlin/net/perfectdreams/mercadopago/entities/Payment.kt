package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName
import net.perfectdreams.mercadopago.PaymentStatus

data class Payment(
        @SerializedName("acquirer")
        val acquirer: Any,
        @SerializedName("acquirer_reconciliation")
        val acquirerReconciliation: List<Any>,
        @SerializedName("additionalInfo")
        val additionalInfo: String? = null,
        @SerializedName("authorization_code")
        val authorizationCode: Any,
        @SerializedName("barcode")
        val barcode: Barcode,
        @SerializedName("binary_mode")
        val binaryMode: Boolean,
        @SerializedName("call_for_authorize_id")
        val callForAuthorizeId: Any,
        @SerializedName("captured")
        val captured: Boolean,
        @SerializedName("card")
        val card: Card,
        @SerializedName("collector_id")
        val collectorId: Int,
        @SerializedName("counter_currency")
        val counterCurrency: Any,
        @SerializedName("coupon_amount")
        val couponAmount: Int,
        @SerializedName("currency_id")
        val currencyId: String,
        @SerializedName("date_approved")
        val dateApproved: Any,
        @SerializedName("date_created")
        val dateCreated: String,
        @SerializedName("date_last_updated")
        val dateLastUpdated: String,
        @SerializedName("date_of_expiration")
        val dateOfExpiration: Any,
        @SerializedName("deduction_schema")
        val deductionSchema: Any,
        @SerializedName("description")
        val description: String,
        @SerializedName("differential_pricing_id")
        val differentialPricingId: Any,
        @SerializedName("external_reference")
        val externalReference: String?,
        @SerializedName("fee_details")
        val feeDetails: List<Any>,
        @SerializedName("id")
        val id: Long,
        @SerializedName("installments")
        val installments: Int,
        @SerializedName("issuer_id")
        val issuerId: Any,
        @SerializedName("live_mode")
        val liveMode: Boolean,
        @SerializedName("merchant_account_id")
        val merchantAccountId: Any,
        @SerializedName("merchant_number")
        val merchantNumber: Any,
        @SerializedName("metadata")
        val metadata: Metadata,
        @SerializedName("money_release_date")
        val moneyReleaseDate: Any,
        @SerializedName("money_release_schema")
        val moneyReleaseSchema: Any,
        @SerializedName("notification_url")
        val notificationUrl: Any,
        @SerializedName("operation_type")
        val operationType: String,
        @SerializedName("order")
        val order: Order,
        @SerializedName("payer")
        val payer: Payer?,
        @SerializedName("payment_method_id")
        val paymentMethodId: String,
        @SerializedName("payment_type_id")
        val paymentTypeId: String,
        @SerializedName("pos_id")
        val posId: Any,
        @SerializedName("processing_mode")
        val processingMode: String,
        @SerializedName("refunds")
        val refunds: List<Any>,
        @SerializedName("shipping_amount")
        val shippingAmount: Double,
        @SerializedName("sponsor_id")
        val sponsorId: Any,
        @SerializedName("statement_descriptor")
        val statementDescriptor: Any,
        @SerializedName("status")
        val status: PaymentStatus,
        @SerializedName("status_detail")
        val statusDetail: String,
        @SerializedName("store_id")
        val storeId: Any,
        @SerializedName("taxes_amount")
        val taxesAmount: Int,
        @SerializedName("transaction_amount")
        val transactionAmount: Double,
        @SerializedName("transaction_amount_refunded")
        val transactionAmountRefunded: Double,
        @SerializedName("transaction_details")
        val transactionDetails: TransactionDetails
)