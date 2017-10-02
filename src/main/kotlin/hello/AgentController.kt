package hello


import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.*

@RestController
class AgentController(private val repository: AgentRepository) {

	@GetMapping("agent")
	fun findAll(): MutableIterable<Agent> = repository.findAll()

	@GetMapping("agent/{lastName}")
	fun findByLastName(@PathVariable lastName:String)
			= repository.findByLastName(lastName)

	@PostMapping("/agent")
	@ResponseStatus(CREATED)
	fun create(@RequestBody u: Agent) { repository.create(u) }
}