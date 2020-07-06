package net.perfectdreams.mercadopago.entities

import com.google.gson.annotations.SerializedName

data class Shipments(
        @SerializedName("receiver_address")
        val receiverAddress: ReceiverAddress
)