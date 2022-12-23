import kotlin.math.*
import kotlin.collections.*
fun main() {
    fun part1(input: List<String>): Int {
        var score = 0
        for (i in input.indices) {
            var a = input[i][0]
            var b = input[i][2]
            when (a) {
                'A' -> when (b) {
                    'X' -> score += 4 //tie
                    'Y' -> score += 8 //win
                    'Z' -> score += 3 //loss
                }
                'B' -> when (b) {
                    'X' -> score += 1 //loss
                    'Y' -> score += 5 //tie
                    'Z' -> score += 9 //win
                }
                'C' -> when (b) {
                    'X' -> score += 7 //win
                    'Y' -> score += 2 //loss
                    'Z' -> score += 6 //tie
                }
            }
        }
        return score
    }

    fun part2(input: List<String>): Int {
        var score = 0
        for (i in input.indices) {
            var a = input[i][0]
            var b = input[i][2]
            when (a) {
                'A' -> when (b) {
                    'X' -> score += 3 //loss
                    'Y' -> score += 4 //tie
                    'Z' -> score += 8 //win
                }
                'B' -> when (b) {
                    'X' -> score += 1 //loss
                    'Y' -> score += 5 //tie
                    'Z' -> score += 9 //win
                }
                'C' -> when (b) {
                    'X' -> score += 2 //loss
                    'Y' -> score += 6 //tie
                    'Z' -> score += 7 //win
                }
            }
        }
        return score
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day02_test")
//    check(part1(testInput) == 1)

    val input = readInput("Day02")
    part1(input).println()
    part2(input).println()
}
