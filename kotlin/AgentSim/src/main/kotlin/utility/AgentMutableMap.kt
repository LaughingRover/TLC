package utility

class AgentMutableMap<K, V>() : MutableMap<K, V> {
    private val agentMap : MutableMap<K, V> = mutableMapOf()

    /**
     * Returns the number of key/value pairs in the map.
     */
    override val size: Int
        get() = agentMap.size

    /**
     * Returns `true` if the map contains the specified [key].
     */
    override fun containsKey(key: K): Boolean = agentMap.containsKey(key)

    /**
     * Returns `true` if the map maps one or more keys to the specified [value].
     */
    override fun containsValue(value: V): Boolean = agentMap.containsValue(value)

    /**
     * Returns the value corresponding to the given [key], or `null` if such a key is not present in the map.
     */
    override fun get(key: K): V? = agentMap[key]


    /**
     * Returns `true` if the map is empty (contains no elements), `false` otherwise.
     */
    override fun isEmpty(): Boolean = agentMap.isEmpty()

    /**
     * Returns a [MutableSet] of all key/value pairs in this map.
     */
    override val entries: MutableSet<MutableMap.MutableEntry<K, V>> = agentMap.entries

    /**
     * Returns a [MutableSet] of all keys in this map.
     */
    override val keys: MutableSet<K>
        get() = agentMap.keys

    /**
     * Returns a [MutableCollection] of all values in this map. Note that this collection may contain duplicate values.
     */
    override val values: MutableCollection<V>
        get() = agentMap.values

    /**
     * Removes all elements from this map.
     */
    override fun clear() { agentMap.clear() }

    /**
     * Associates the specified [value] with the specified [key] in the map.
     *
     * @return the previous value associated with the key, or `null` if the key was not present in the map.
     */
    override fun put(key: K, value: V): V? = agentMap.put(key, value)

    /**
     * Updates this map with key/value pairs from the specified map [from].
     */
    override fun putAll(from: Map<out K, V>) { agentMap.putAll(from) }

    /**
     * Removes the specified key and its corresponding value from this map.
     *
     * @return the previous value associated with the key, or `null` if the key was not present in the map.
     */
    override fun remove(key: K): V? = agentMap.remove(key)

    override fun toString(): String {
        return "AgentMutableMap(agentMap=$agentMap, entries=$entries)"
    }

}