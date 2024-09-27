
// Variables and Data Types:
fun main(){
    var age: Int = 22
    var height: Double = 1.82
    var isStudent: Boolean = true
    var name: String = "Murat"
    var surname: String = "Tinal"

    println("Name: ${name}")
    println("Surname: ${surname}")
    println("Age: ${age}")
    println("Is he Student?: ${isStudent}}")
    println("Height: ${height}")

    checkNumber()
    printNumbers()
    printNumberswithWhile()
    listOfNumbers()
}
// Conditional Statements:
fun checkNumber(){
    print("Enter the number: ")
    var a = readln().toInt()
    if (a > 0)
        println("${a} is POSITIVE number")
    else if (a < 0)
        println("${a} is NEGATIVE number")
    else
        println("${a} is ZERO number")
}
// Loops:
fun printNumbers(){
    println("With loop 'for' ")
    for (i in 1 .. 10){
        println(i)
    }
}

fun printNumberswithWhile(){
    println("With 'while' ")
    var a = 1
    while (a < 11){
        println(a)
        a++
    }
}
//Collections:
fun listOfNumbers(){
    var listsNumbers  = listOf(5,7,8,9,36,46,12,35,25)
    var sum = 0
    for (i in listsNumbers){
        sum = sum + i
    }
    println("The sum of all numbers: ${sum}")
}


