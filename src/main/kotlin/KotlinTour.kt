fun main() {
    println("Lesson 1 - Hello World!")
    // Hello World!
    println("Hello World!")

    val popcorn = 5
    val hotdog = 7
    var customers = 10

    println(popcorn)
    println(hotdog)
    println(customers)
//    hotdog = 5 - not possible to change val
    customers = customers + 5
    println(hotdog)
    println(customers)
    println("There are only $popcorn popcorns, $hotdog hotdogs")
    println("We have only ${hotdog+popcorn} portions and $customers customers :(")

    println("Lesson 1 exercise ----------------------------")
    //Task 1 - Complete the code to make the program print "Mary is 20 years old" to standard output:
    val name = "Mary"
    val age = 20
    // Write your code here
    println("$name is $age years old")
    println("--------------------------------------------------------")
    }