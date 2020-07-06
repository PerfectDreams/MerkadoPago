package net.perfectdreams.mercadopago.dsl

import com.google.gson.annotations.SerializedName
import net.perfectdreams.mercadopago.entities.*

fun paymentSettings(block: PaymentSettingsBuilder.() -> Unit): PaymentSettings = PaymentSettingsBuilder().apply(block).build()

class PaymentSettingsBuilder {
    val items = mutableListOf<Item>()
    var payer: PaymentSettings.Payer? = null
    var externalReference: String? = null
    var notificationUrl: String? = null
    var paymentMethods: PaymentMethods? = null

    fun item(block: ItemBuilder.() -> Unit) = items.add(ItemBuilder().apply(block).build())

    fun payer(block: PaymentSettingsPayerBuilder.() -> Unit) {
        payer = PaymentSettingsPayerBuilder().apply(block).build()
    }

    fun paymentMethods(block: PaymentMethodsBuilder.() -> Unit) {
        paymentMethods = PaymentMethodsBuilder().apply(block).build()
    }

    fun build() = PaymentSettings(
            items = items,
            payer = payer,
            externalReference = externalReference,
            notificationUrl = notificationUrl,
            paymentMethods = paymentMethods
    )
}

class ItemBuilder {
    @SerializedName("title")
    var title: String? = null
    @SerializedName("quantity")
    var quantity: Int? = null
    @SerializedName("currency_id")
    var currencyId: String? = null
    @SerializedName("unit_price")
    var unitPrice: Float? = null

    @SerializedName("category_id")
    var categoryId: String? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("id")
    var id: String? = null
    @SerializedName("picture_url")
    var pictureUrl: String? = null

    fun build() = Item(
            title!!,
            quantity!!,
            currencyId!!,
            unitPrice!!,
            categoryId,
            description,
            id,
            pictureUrl
    )
}

class PaymentSettingsPayerBuilder {
    var address: Address? = null
    var dateCreated: String? = null
    var email: String? = null
    var identification: Identification? = null
    var firstName: String? = null
    var phone: Phone? = null
    var lastName: String? = null

    fun build() = PaymentSettings.Payer(
            address = address,
            dateCreated = dateCreated,
            email = email,
            identification = identification,
            firstName = firstName,
            phone = phone,
            lastName = lastName
    )
}

class PaymentMethodsBuilder {
    var excludedPaymentMethods: List<String>? = null
    var excludedPaymentTypes: List<String>? = null
    var installments: Int = 1

    fun build() = PaymentMethods(
            excludedPaymentTypes = excludedPaymentTypes?.map { ExcludedPaymentType(it) },
            excludedPaymentMethods = excludedPaymentMethods?.map { ExcludedPaymentMethod(it) },
            installments = installments
    )
}