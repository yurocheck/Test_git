package org.example

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65

fun main() {
        val c = ("Hello, Git!")
        println(c::class.simpleName)
        println(c)

        println()
        println()


        val userAge = readln().toInt()

        val resultText = if (userAge >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
        else if (userAge == 16 || userAge == 17) "Показать экран с ограниченным контентом"
        else "Вернуться на главный экран приложения"
        println(resultText)

        println()
        println()

        var counter = 5
        while (counter > 0) {
                println("Реклама закончится через ${counter--}")
                Thread.sleep(1000)
        }

        println()
        println()

        for (i in 5 downTo 1) {
                println("Реклама закончится через $i")
                Thread.sleep(1000)

        }

        println()
        println()


        for (i in 5 downTo 1) {
                if (i == 3) {
                        println("Пользователь нажал на кнопку \"Пропустить\"")
                        break
                }
                println("Реклама закончится через $i")
                Thread.sleep(1000)
        }
        println("Продолжение работы программы вне цикла")

        println()
        println()

        val arrayOfIngredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец")
        for (i in arrayOfIngredients) {
                println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
        }

}