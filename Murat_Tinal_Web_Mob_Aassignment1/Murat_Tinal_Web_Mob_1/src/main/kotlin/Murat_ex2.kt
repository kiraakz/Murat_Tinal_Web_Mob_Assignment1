

fun main(){
    var personInfo = Person("Murat Tinal", 22,"murattnl02@gmail.com")
    personInfo.detaiilOfPerson()
    println()

    var employee = Employee("Marlen Sovet", 22, "marlen02@gmail.com", 300000.5)
    employee.detaiilOfPerson()
    println()

    var accountBank = BankAcc(350000.0)
    accountBank.checkBalance()
    accountBank.deposit(100000.0)
    accountBank.checkBalance()
    accountBank.deposit(500000.0)
    accountBank.checkBalance()
    accountBank.withdrew(200000.0)
    accountBank.checkBalance()
}

open class Person(var name: String, var age: Int, var mail: String){
    open fun detaiilOfPerson(){
        println("""
            Name: ${name}
            Age: ${age}
            Email: ${mail}
        """.trimIndent())
    }
}

class Employee(name: String, age: Int, mail: String, var salary: Double) : Person(name,age,mail){
    override fun detaiilOfPerson() {
        super.detaiilOfPerson()
        println("Salary: ${salary}")
    }
}

class BankAcc(private var balans: Double){
    fun deposit(amount: Double){
        if (amount > 0){
            balans = balans + amount
            println("Deposit: ${amount}")
            println("Balance: ${balans}")
        }else{
            println("Invalid amount")

        }
    }

    fun withdrew(amount: Double){
        if (amount > 0 && amount <= balans){
            balans = balans - amount
            println("Withdrew: ${amount}")
            println("Balance: ${balans}")
        } else{
            println("Invalid amout")
        }
    }

    fun checkBalance(){
        println("Current balace: ${balans}")
    }
}

