import kotlin.math.*
import kotlin.collections.*
import java.util.*

fun dfs(start: Node) {
    start.vis = true
    var stk = Stack<Node>()
    stk.push(start)
    while (!stk.isEmpty()) {
        var u = stk.pop()
        for (i in u.neighbors) {
            if (!i.vis) {
                i.vis = true
                stk.push(i)
            }
        }
    }
}

class Node {
    var vis = false
    var neighbors = ArrayList<Node>()
}

fun main() {
    fun part1(input: List<String>): Int {
        var E = ArrayList<ArrayList<Integer>>()
        return 0
    }

    fun part2(input: List<String>): Int {
        return 0
    }

    // test if implementation meets criteria from the description, like:
//    val testInput = readInput("Day07_test")
//    part2(testInput).println()

    val input = readInput("Day07")
    part1(input).println()
    part2(input).println()
}
