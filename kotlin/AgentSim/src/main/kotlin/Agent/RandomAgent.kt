package Agent

import Action.Action
import Action.ForageAction
import Action.NoAction
import Actor
import Percept
import kotlin.random.Random

class RandomAgent(override val name: String, var params : Double) : Actor {

    override fun act(): Action {
        val rand = Random.nextDouble(0.0, 1.0)
        return if (rand > params) { ForageAction() } else NoAction()
    }

    override fun perceive(vararg facts: Percept) {
//        TODO("Not yet implemented")
    }

    override fun toString(): String {
        return "Call me $name for today. PS: It's random with me"
    }
}