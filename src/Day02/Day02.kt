package Day02

import readInput

fun main() {

    fun part1(input: List<String>): Int {
        var depth = 0
        var horizontal = 0
        for (i in input){
            val delta = Character.getNumericValue(i.last())

            if (i.contains("forward")){
                horizontal = horizontal + delta
                println(horizontal)
            }
            if (i.contains("down")){
                depth = depth + delta
            }
            if (i.contains("up")){
                depth = depth - delta
            }
        }
        return depth*horizontal
    }

    fun part2(input: List<String>): Int {
        var aim = 0
        var depth = 0
        var horizontal = 0

        for (i in input){
            val delta = Character.getNumericValue(i.last())

            if (i.contains("forward")){
                horizontal = horizontal + delta
                depth = depth + (aim * delta)
            }
            if (i.contains("down")){
                aim = aim + delta
            }
            if (i.contains("up")){
                aim = aim - delta
            }
        }
        return horizontal * depth
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02/Day02_test")
    check(part1(testInput) == 150)
    check(part2(testInput) == 900)

    val input = readInput("Day02/Day02")
    println(part1(input))
    println(part2(input))
}