package d_while_loops

// 39) Make an algorithm that displays the following count on the screen: 10 9 8 7 6 5 4 3 Finished!

fun main() {
    var counter = 10

    while (counter in 3..10) {
        print("$counter.. ")
        counter--
    }
    println("Done!")
}