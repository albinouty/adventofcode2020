import java.io.File

fun main(args: Array<String>) {d
    fun readFileAsLinesUsingUseLines(fileName: String): List<String> = File(fileName).useLines { it.toList() }
    val inputDayTwo = readFileAsLinesUsingUseLines("src/main/resources/inputday2.txt")

    println(inputDayTwo)
}