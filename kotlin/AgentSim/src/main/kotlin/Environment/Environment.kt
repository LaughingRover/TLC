package Environment

import Action.Action
import Actor

abstract class Environment(vararg ags: Actor) {
        private val agents : List<Actor> = ags.toList()

        open fun step() {
            for (agent in agents) {
                sense(agent)
                processAction(agent, agent.act())
            }
        }

        abstract fun processAction(agent : Actor, act : Action)

        abstract fun sense(agent : Actor)
}