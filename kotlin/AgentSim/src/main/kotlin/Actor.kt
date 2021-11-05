import Action.Action

interface Actor {
    val name : String
    fun act() : Action
    fun perceive(vararg facts : Percept)
}