package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class PaymentMethods(
        @SerializedName("default_installments")
        val defaultInstallments: Any? = null,
        @SerializedName("default_payment_method_id")
        val defaultPaymentMethodId: String? = null,
        @SerializedName("excluded_payment_methods")
        val excludedPaymentMethods: List<ExcludedPaymentMethod>? = null,
        @SerializedName("excluded_payment_types")
        val excludedPaymentTypes: List<ExcludedPaymentType>? = null,
        @SerializedName("installments")
        val installments: Int
)