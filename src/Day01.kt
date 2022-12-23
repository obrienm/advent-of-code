import kotlin.math.*
import kotlin.collections.*
fun main() {
    fun part1(input: List<String>): Int {
        var max = 0
        var sum = 0
        for (i in input.indices) {
            if (input[i].isNotEmpty()) sum += input[i].toInt()
            else {
                max = max(max, sum)
                sum = 0
            }
        }
        return max
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        var sumArray = ArrayList<Int>()
        for (i in input.indices) {
            if (input[i].isNotEmpty()) sum += input[i].toInt()
            else {
                sumArray.add(sum)
                sum = 0
            }
        }
        sumArray.sort()
        return sumArray[sumArray.size-3] + sumArray[sumArray.size-2] + sumArray[sumArray.size-1]
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day01_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day01")
    part1(input).println()
    part2(input).println()
}
