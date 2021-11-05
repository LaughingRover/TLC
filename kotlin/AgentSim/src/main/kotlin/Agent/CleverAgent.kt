package Agent

import Action.Action
import Action.ForageAction
import Action.HuntAction
import Actor
import Percept

class CleverAgent(override val name: String, private var clever : Percept? = null) : Actor {
    private var animal : String? = null

    override fun act(): Action {
        return animal?.let { HuntAction(it) } ?: ForageAction()
    }


    override fun perceive(vararg facts: Percept) {
        animal = if (facts.isNotEmpty()) facts.component1().value else null
    }

    override fun toString(): String {
        return "Call me clever agent $name"
    }
}