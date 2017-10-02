package hello

import org.springframework.data.repository.CrudRepository

interface AgentRepository : CrudRepository<Agent, Long> {

	fun findByLastName(lastName: String): Iterable<Agent>

    fun create(agent: Agent): Agent {
        save(agent)
        return agent
    }
}
