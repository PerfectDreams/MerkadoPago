package net.perfectdreams.mercadopago

import com.google.gson.annotations.SerializedName

enum class PaymentStatus(val internal: String) {
    @SerializedName("pending")
    PENDING("pending"),
    @SerializedName("approved")
    APPROVED("approved"),
    @SerializedName("in_process")
    IN_PROCESS("in_process"),
    @SerializedName("in_mediation")
    IN_MEDIATION("in_mediation"),
    @SerializedName("rejected")
    REJECTED("rejected"),
    @SerializedName("cancelled")
    CANCELLED("cancelled"),
    @SerializedName("refunded")
    REFUNDED("refunded"),
    @SerializedName("charged_back")
    CHARGED_BACK("charged_back"),
    @SerializedName("unknown")
    UNKNOWN("unknown")
}