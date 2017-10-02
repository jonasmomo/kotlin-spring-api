package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class AgentController(private val repository: AgentRepository) {

	@GetMapping("agent")
	fun findAll(): MutableIterable<Agent> = repository.findAll()

	@GetMapping("agent/{lastName}")
	fun findByLastName(@PathVariable lastName:String)
			= repository.findByLastName(lastName)
}