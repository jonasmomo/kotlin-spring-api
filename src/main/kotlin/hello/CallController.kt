package hello

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CallController(private val repository: CallRepository) { // Binder repo mot controller ?

    @GetMapping("call")
    fun findAll(): MutableIterable<Call> = repository.findAll() // default method findAll()

    @GetMapping("call/{caller}")
    fun findByCaller(@PathVariable caller:String)
            = repository.findByCaller(caller)
}