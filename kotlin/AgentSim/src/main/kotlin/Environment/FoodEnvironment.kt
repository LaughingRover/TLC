package Environment

import Action.Action
import Action.ForageAction
import Action.HuntAction
import Action.NoAction
import Actor
import Percept
import kotlin.random.Random

class FoodEnvironment(vararg ags: Actor) : Environment(*ags) {
//    val scores : AgentMutableMap<Actor, Int> = AgentMutableMap()
    val scores : MutableMap<Actor, Int> = mutableMapOf<Actor, Int>()
    var animal: String? = null

    init {
        for (agent in ags) {
            scores[agent] = 0
        }
    }

    override fun step() {
        val rand = Random.nextDouble(0.0, 1.0)
        if (rand >= 0.5) animal = "Sweet Aponkye"
        else animal
        super.step()
    }

    override fun processAction(agent: Actor, act: Action) {
        when(act) {
            is ForageAction -> scores[agent] = scores[agent]?.plus(1) ?: 1
            is HuntAction -> scores[agent] = scores[agent]?.plus(2) ?: 2
            is NoAction -> scores[agent]
        }
    }

    override fun sense(agent: Actor) {
        if (animal == null) agent.perceive()
        else { agent.perceive(Percept("animal", animal)) }
    }


}