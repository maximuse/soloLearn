fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0

    total = when {
        hours <= 5 -> hours!!.toDouble()
        hours > 5 && hours < 24 -> 5 + (hours - 5) * 0.5
        else -> (hours / 24 * 15) + (hours % 24 * 0.5)
    }

    println(total)
}