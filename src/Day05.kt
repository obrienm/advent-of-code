import kotlin.math.*
import kotlin.collections.*
import java.util.*

fun main() {
    var stk1 = Stack<String>()
    var stk2 = Stack<String>()
    var stk3 = Stack<String>()
    var stk4 = Stack<String>()
    var stk5 = Stack<String>()
    var stk6 = Stack<String>()
    var stk7 = Stack<String>()
    var stk8 = Stack<String>()
    var stk9 = Stack<String>()
//    stk1.push("Z")
//    stk1.push("N")
//    stk2.push("M")
//    stk2.push("C")
//    stk2.push("D")
//    stk3.push("P")
//    println(stk1)
//    println(stk2)
//    println(stk3)
    stk1.push("B")
    stk1.push("V")
    stk1.push("S")
    stk1.push("N")
    stk1.push("T")
    stk1.push("C")
    stk1.push("H")
    stk1.push("Q")
    stk2.push("W")
    stk2.push("D")
    stk2.push("B")
    stk2.push("G")
    stk3.push("F")
    stk3.push("W")
    stk3.push("R")
    stk3.push("T")
    stk3.push("S")
    stk3.push("Q")
    stk3.push("B")
    stk4.push("L")
    stk4.push("G")
    stk4.push("W")
    stk4.push("S")
    stk4.push("Z")
    stk4.push("J")
    stk4.push("D")
    stk4.push("N")
    stk5.push("M")
    stk5.push("P")
    stk5.push("D")
    stk5.push("V")
    stk5.push("F")
    stk6.push("F")
    stk6.push("W")
    stk6.push("J")
    stk7.push("L")
    stk7.push("N")
    stk7.push("Q")
    stk7.push("B")
    stk7.push("J")
    stk7.push("V")
    stk8.push("G")
    stk8.push("T")
    stk8.push("R")
    stk8.push("C")
    stk8.push("J")
    stk8.push("Q")
    stk8.push("S")
    stk8.push("N")
    stk9.push("J")
    stk9.push("S")
    stk9.push("Q")
    stk9.push("C")
    stk9.push("W")
    stk9.push("D")
    stk9.push("M")

    fun helper(to: Int, crate: String?) {
        when(to) {
            1 -> stk1.push(crate)
            2 -> stk2.push(crate)
            3 -> stk3.push(crate)
            4 -> stk4.push(crate)
            5 -> stk5.push(crate)
            6 -> stk6.push(crate)
            7 -> stk7.push(crate)
            8 -> stk8.push(crate)
            9 -> stk9.push(crate)
        }
    }

    fun part1(input: List<String>): String {
        for (i in input.indices) {
            var strs = input[i].split(" ")
            if (strs[0] != "move") continue
            val move = strs[1].toInt()
            val from = strs[3].toInt()
            val to = strs[5].toInt()
            when (from) {
                1 -> for (i in 1..move) {
                    if (stk1.isNotEmpty()) {
                        var crate = stk1.pop()
                        helper(to, crate)
                    }
                }
                2 -> for (i in 1..move) {
                    if (stk2.isNotEmpty()) {
                        var crate = stk2.pop()
                        helper(to, crate)
                    }
                }
                3 -> for (i in 1..move) {
                    if (stk3.isNotEmpty()) {
                        var crate = stk3.pop()
                        helper(to, crate)
                    }
                }
                4 -> for (i in 1..move) {
                    if (stk4.isNotEmpty()) {
                        var crate = stk4.pop()
                        helper(to, crate)
                    }
                }
                5 -> for (i in 1..move) {
                    if (stk5.isNotEmpty()) {
                        var crate = stk5.pop()
                        helper(to, crate)
                    }
                }
                6 -> for (i in 1..move) {
                    if (stk6.isNotEmpty()) {
                        var crate = stk6.pop()
                        helper(to, crate)
                    }
                }
                7 -> for (i in 1..move) {
                    if (stk7.isNotEmpty()) {
                        var crate = stk7.pop()
                        helper(to, crate)
                    }
                }
                8 -> for (i in 1..move) {
                    if (stk8.isNotEmpty()) {
                        var crate = stk8.pop()
                        helper(to, crate)
                    }
                }
                9 -> for (i in 1..move) {
                    if (stk9.isNotEmpty()) {
                        var crate = stk9.pop()
                        helper(to, crate)
                    }
                }
            }
        }
        println(stk1)
        println(stk2)
        println(stk3)
        println(stk4)
        println(stk5)
        println(stk6)
        println(stk7)
        println(stk8)
        println(stk9)
        var res = ""
        if (stk1.isNotEmpty()) res += stk1.pop()
        if (stk2.isNotEmpty()) res += stk2.pop()
        if (stk3.isNotEmpty()) res += stk3.pop()
        if (stk4.isNotEmpty()) res += stk4.pop()
        if (stk5.isNotEmpty()) res += stk5.pop()
        if (stk6.isNotEmpty()) res += stk6.pop()
        if (stk7.isNotEmpty()) res += stk7.pop()
        if (stk8.isNotEmpty()) res += stk8.pop()
        if (stk9.isNotEmpty()) res += stk9.pop()
        return res
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day05_test")
//    part1(testInput).println()

    val input = readInput("Day05")
    part1(input).println()
    part2(input).println()
}
