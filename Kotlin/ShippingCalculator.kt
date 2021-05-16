fun shippingCost(amount: Double, international: Boolean): Double {
    if (!international) {
        return if (amount >= 75.0) 0.0 else amount * 0.1
    }
    else {
        return if ((amount * 0.15) > 50.0) 50.0 else amount * 0.15
    }
}

fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()

    println(shippingCost(total, international))
}