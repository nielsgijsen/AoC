fun main() {

    fun numberOfLargerNextElements(list: List<Int>): Int {
        return list.zipWithNext { a, b ->
            if (a < b) 1 else 0
        }.sum()
    }

    fun part1(input: List<String>): Int {
        val inputInt = input.map { it.toInt() }
        return numberOfLargerNextElements(inputInt)
    }

    fun part2(input: List<String>): Int {
        val inputInt = input.map { it.toInt() }
        val movingWindow = inputInt.windowed(3, 1) { it.sum() }
        return numberOfLargerNextElements(movingWindow)
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
