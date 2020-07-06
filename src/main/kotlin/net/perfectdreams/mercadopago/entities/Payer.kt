package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class Payer(
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("entity_type")
    val entityType: Any? = null,
    @SerializedName("first_name")
    val firstName: Any? = null,
    @SerializedName("identification")
    val identification: Identification? = null,
    @SerializedName("last_name")
    val lastName: Any? = null,
    @SerializedName("operator_id")
    val operatorId: Any? = null,
    @SerializedName("phone")
    val phone: Phone? = null,
    @SerializedName("type")
    val type: String? = null
)