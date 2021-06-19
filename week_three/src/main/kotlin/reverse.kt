fun main() {

    println("Enter string:")
    val str = readLine()

    var result: String = ""
    var lastIndex = str!!.lastIndex

    while (lastIndex >= 0) {
        result += str[lastIndex]
        lastIndex--
    }

    println("Reversed: $result")
}