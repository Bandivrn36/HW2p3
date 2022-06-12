fun main() {
    val sum: Float = 35000F
    val discountStandart: Int = 100
    val discountPercent: Float = sum / 100 * 5
    val meloman: Boolean = true


    if (sum <= 1000) {
        if (meloman) {
            println("Сумма...$sum")
            println("После скидки 1%..." + (sum - (sum / 100 * 1)))
        } else {
            println("Сумма...$sum")
        }

    } else if ((sum > 1000) && (sum <= 10000)) {
        if (meloman) {
            println("Сумма...$sum")
            println("После скидки 100р...." + (sum - discountStandart))
            println("После скидки 1%..." + ((sum - discountStandart) - ((sum - discountStandart) / 100 * 1)))
        } else {
            println("Сумма...$sum")
            println("После скидки 100р...." + (sum - discountStandart))
        }

    } else if (sum > 10000){
        if (meloman) {
            println("Сумма...$sum")
            println("После скидки 5%..." + (sum - discountPercent))
            println(("После скидки 1%..." + ((sum - discountPercent) - ((sum - discountPercent) / 100 * 1))))
        } else {
            println("Сумма...$sum")
            println("После скидки 5%..." + (sum - discountPercent))
        }

    }
}



