import java.util.*

fun main() {

    fun part1(input: List<String>): Int {
        val size = input.size
        val rowSize = input[0].length
        val gammaRateArray = IntArray(rowSize)
        val epsilonRateArray = IntArray(rowSize)

        for (i in 0..rowSize-1){
            var occurance = 0
            for (j in 0..size-1){
                if (input[j][i] == '1'){
                    occurance++
                }
            }
            if (occurance > size/2){
                gammaRateArray.set(i, 1)
            } else {
                epsilonRateArray.set(i, 1)
            }
        }

        val gammaRate = gammaRateArray.joinToString("").toInt(2)
        val epsilonRate = epsilonRateArray.joinToString("").toInt(2)

        println("Gamma Rate = $gammaRate - Epsilon Rate = $epsilonRate" )

        return gammaRate * epsilonRate
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day03/Day03_test")
    check(part1(testInput) == 198)
    check(part2(testInput) == 0)

    val input = readInput("Day03/Day03")
    println(part1(input))
    println(part2(input))
}
