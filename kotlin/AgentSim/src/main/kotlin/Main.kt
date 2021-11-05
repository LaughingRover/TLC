import Agent.CleverAgent
import Agent.RandomAgent
import Agent.SimpleAgent
import Environment.FoodEnvironment

fun main(args: Array<String>) {
    // Try adding program arguments at Run/Debug configuration
    // println("Program arguments: ${args.joinToString()}")

//    println("Hello, ")
//
//    val agent1 = SimpleAgent("Agron")
////    println(agent1.act())
//
//    val env = FoodEnvironment(agent1)
//    env.step()
//    println(env.scores)
//
//    val env2 = FoodEnvironment()
//    for (i in 1..10) {
//        env2.step()
//        println(env2.animal)
//    }

    val env3 = FoodEnvironment(CleverAgent("Charlie"), RandomAgent("Bob", 0.2), SimpleAgent("Alice"))
    for (i in 1..100) {
        env3.step()
    }
    println(env3.scores)
}