package d_while_loops

// 47) Develop an application that displays the result of the expression 500 + 450 + 400 + 350 + 300 + … + 50 + 0 on the screen.

fun main() {
    var counter = 500
    var sum = 0

    while (counter >= 0) {
        sum += counter
        counter -= 50
    }
    print("Sum: $sum")
}