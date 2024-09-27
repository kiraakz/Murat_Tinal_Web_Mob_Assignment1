fun main(){
    println("Enter 2 number: ")
    var number1 : Int = readln().toInt()
    var number2 : Int = readln().toInt()
    println("Number 1 is: ${number1}")
    println("Number 2 is: ${number2}")

    var rezPlus = plus(number1,number2)
    println("Sum: ${rezPlus}")

    var rezMultiply = multiply(number1,number2)
    println("Multiply: ${rezMultiply}")

    var rezHighOrderPlus = highOrderFunction(number1,number2, ::plus)
    println("Higher order fun for SUM : ${rezHighOrderPlus}")

    var rezHighOrderMult = highOrderFunction(number1,number2,multiply)
    println("Higher order fun for MULTIPLY: ${rezHighOrderMult}")

}


fun plus(number1: Int, number2: Int):Int{
    return number1 + number2
}

var multiply : (Int, Int) -> Int = {a,b -> a*b}

fun highOrderFunction(number1: Int, number2: Int, op : (Int,Int) -> Int): Int{
    return op(number1,number2)
}

