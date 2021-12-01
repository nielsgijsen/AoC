fun main() {
    fun part1(input: List<String>): Int {
        var count = 0
        val inputInterger = input.map { it.toInt() }
        for (i in 1..inputInterger.size-1){
            if(inputInterger[i] > inputInterger[i-1]){
                count++
            }
        }
        return count
    }

    fun part2(input: List<String>): Int {
        var count = 0
        val inputInt = input.map { it.toInt() }
        val movingWindow = inputInt.windowed(3, 1) { it.sum() }
        for (i in 0..movingWindow.size-2){
            if (movingWindow[i] < movingWindow[i+1])
                count++
        }
        println(movingWindow)
        return count
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
