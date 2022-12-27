import kotlin.math.*
import kotlin.collections.*
import java.util.*

fun main() {
    fun part1(input: List<String>): Int {
        var cnt = 0
        for (i in 0 until input[0].length-3) {
            var str = input[0].substring(i, i+4)
            var set = HashSet<Char>()
            var charArray = str.toCharArray()
            set.add(charArray[0])
            set.add(charArray[1])
            set.add(charArray[2])
            set.add(charArray[3])
            if (set.size == str.length) break
            else cnt++
        }
        return cnt+4
    }

    fun part2(input: List<String>): Int {
        var cnt = 0
        for (i in 0 until input[0].length-13) {
            var str = input[0].substring(i, i+14)
            var set = HashSet<Char>()
            var charArray = str.toCharArray()
            set.add(charArray[0])
            set.add(charArray[1])
            set.add(charArray[2])
            set.add(charArray[3])
            set.add(charArray[4])
            set.add(charArray[5])
            set.add(charArray[6])
            set.add(charArray[7])
            set.add(charArray[8])
            set.add(charArray[9])
            set.add(charArray[10])
            set.add(charArray[11])
            set.add(charArray[12])
            set.add(charArray[13])
            if (set.size == str.length) break
            else cnt++
        }
        return cnt+14
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day06_test")
//    part1(testInput).println()

    val input = readInput("Day06")
    part1(input).println()
    part2(input).println()
}
