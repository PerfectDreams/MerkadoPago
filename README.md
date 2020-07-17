
<p align="center">
<h1 align="center">💸 MerkadoPago 💸</h1>

<p align="center">
<a href="https://mrpowergamerbr.com/"><img src="https://img.shields.io/badge/website-mrpowergamerbr-fe4221.svg"></a>
<a href="https://github.com/PerfectDreams/YetAnotherSimpleMavenRepo/blob/master/LICENSE"><img src="https://img.shields.io/badge/license-AGPL%20v3-lightgray.svg"></a>
</p>

MerkadoPago is a Kotlin wrapper for [MercadoPago's API](https://www.mercadopago.com.br/developers/pt/guides/payments/api/introduction/).

## 😡 But there's already an official SDK!

Yes, [there is](https://github.com/mercadopago/dx-java).

But I didn't like how the SDK fundamentally works, example:
* It uses a global static class for the SDK, you can't use multiple SDK clients in the same application unless if you get the access token and then set the access token for *every* request.
* Some methods are named... badly. `save()` methods that actually block the thread and sends a request to MercadoPago to *create* the payment/preference/etc.

Of course, MerkadoPago isn't perfect and I created it for my own projects, but that's the reason we decided to create our own library instead of using the official SDK.

## 🤔 How to use?

### Dependency Info
```kotlin
repositories {
    ...
    maven{ url 'https://repo.perfectdreams.net/' }
}

dependencies {
    ...
    implementation("net.perfectdreams:merkadopago:1.0.0")
}
```

### Creating a MercadoPago API instance

#### With the client ID + client secret
```kotlin
val mercadoPago = MercadoPago(
	clientId = yourClientIdHere,
	clientSecret = yourClientSecretHere
)
```

#### With an access token
```kotlin
val mercadoPago = MercadoPago(
	accessToken = yourAccessTokenHere
)
```

### Creating a Payment
```kotlin
val settings = paymentSettings {
	item {
		title = "Loritta's Plushie"
		quantity = 1
		currencyId = "BRL"
        
        unitPrice = 10f

		if (userEmail != null) {
			payer {
				email = userEmail
			}
		}
    }

	externalReference = "MY-EXTERNAL-REFERENCE-HERE"

	notificationUrl = "https://my.website.com/api/v1/callbacks/mercadopago"
}

val payment = mercadoPago.createPayment(settings)

println("Your payment URL: ${payment.initPoint}")
println("Your sandboxed payment URL: ${payment.sandboxInitPoint}")
```

### Getting a payment
```kotlin
val payment = mercadoPago.getPaymentInfoById(12345L)
```
