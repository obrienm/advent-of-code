import kotlin.math.*
import kotlin.collections.*
fun main() {
    fun part1(input: List<String>): Int {
        var sum = 0
        for (i in input.indices) {
            val n = input[i].length
            var sub1 = input[i].substring(0, n/2)
            var sub2 = input[i].substring(n/2, n)
            var charSet = HashSet<Char>()
            for (i in sub1) if (sub2.contains(i)) charSet.add(i)
            for (j in charSet) {
                sum += if (j.code >= 97) (j.code - 96)
                else (j.code - 64) + 26
            }
        }
        return sum
    }

    fun part2(input: List<String>): Int {
        var sum = 0
        for (i in input.indices step 3) {
            val a = input[i]
            val b = input[i+1]
            val c = input[i+2]
            val tmpSet = HashSet<Char>()
            for (j in c) if (b.contains(j)) tmpSet.add(j)
            val finalSet = HashSet<Char>()
            for (j in tmpSet) if (a.contains(j)) finalSet.add(j)
            for (j in finalSet) {
                sum += if (j.code >= 97) (j.code - 96)
                else (j.code - 64) + 26
            }
        }
        return sum
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day03_test")
//    part2(testInput).println()

    val input = readInput("Day03")
    part1(input).println()
    part2(input).println()
}
