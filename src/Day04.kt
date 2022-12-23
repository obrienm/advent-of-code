import kotlin.math.*
import kotlin.collections.*

fun main() {
    fun part1(input: List<String>): Int {
        var cnt = 0
        for (i in input.indices) {
            val strs = input[i].split('-', ',').toTypedArray()
            if (strs[0].toInt() == strs[2].toInt()) cnt++
            if (strs[0].toInt() < strs[2].toInt() && strs[1].toInt() >= strs[3].toInt()) cnt++
            if (strs[0].toInt() > strs[2].toInt() && strs[1].toInt() <= strs[3].toInt()) cnt++
        }
        return cnt
    }

    fun part2(input: List<String>): Int {
        var cnt = 0
        for (i in input.indices) {
            val strs = input[i].split('-', ',').toTypedArray()
            if (strs[0].toInt() == strs[2].toInt()) cnt++
            if (strs[0].toInt() < strs[2].toInt() && strs[2].toInt() <= strs[1].toInt()) cnt++
            if (strs[0].toInt() > strs[2].toInt() && strs[0].toInt() <= strs[3].toInt()) cnt++
        }
        return cnt
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day04_test")
//    part1(testInput).println()

    val input = readInput("Day04")
    part1(input).println()
    part2(input).println()
}
