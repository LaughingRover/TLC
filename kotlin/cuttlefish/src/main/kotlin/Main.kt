fun calculateY(m : Int, x : Int, c : Int) : Int {
    // y = mx + c - formula for a straight line
    return m * x + c
}

fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {
    // This function takes the equations of two lines:
    // yOne = mOne * x + cOne and yTwo = mTwo * x + cTwo
    // and prints the X value they intersect at
    // or prints "Don't intersect" if they do not.
    // You only need to check x values between 0 and 100

    loop@ for (x : Int in 0..100) {
        var yOne = calculateY(mOne, x, cOne)
        var yTwo = calculateY(mTwo, x, cTwo)

        if (yOne === yTwo) {
            return println("The intersect of both lines is: coordinates -> (x: $x, y: $yOne )")
        }
    }
    return println("Don't Intersect!")
}


var funds : Double = 100.0
val pswd = "password"

fun main(args: Array<String>) {
//    Try adding program arguments at Run/Debug configuration
//    println("Program arguments: ${args.joinToString()}")

//    var greeting : String = "Hello"
//    println("$greeting, world!")

//    intersection(-2, 3, 3,-2)

    var input : String
    var cmd : List<String>

    loop@ while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")

        try {
            when (cmd[0]) {
                // Each command goes here...
                "balance" -> balance()
                "deposit" -> if (!(cmd[1].toDouble().isNaN()) || cmd[1] != null) deposit(cmd[1].toDouble())
                "withdraw" -> if (!(cmd[1].toDouble().isNaN()) || cmd[1] != null) withdraw(cmd[1].toDouble())
                else -> println("Invalid command")
            }
        } catch (e: Exception) {
            println("Stop stressing me!")
        } finally {
            continue
        }
    }

}

fun withdraw(amount : Double) : Unit {
    print("Enter password: ")
    var input : String = readLine()!!

    if (input == pswd) {
        funds -= amount
    } else {
        println("You thief!")
    }
}

fun deposit(amount : Double) {
    funds += amount
    print("New balance is: $funds \n")
}

fun balance() : Unit {
    println("$funds")
}


//Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 1, Size: 1
//at java.base/java.util.Collections$SingletonList.get(Collections.java:4926)
//at MainKt.main(Main.kt:47)
