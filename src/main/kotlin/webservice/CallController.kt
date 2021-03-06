package webservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CallController(private val repository: CallRepository) {

    @GetMapping("call")
    fun findAll(): MutableIterable<Call> = repository.findAll()

    @GetMapping("call/{caller}")
    fun findByCaller(@PathVariable caller:String)
            = repository.findByCaller(caller)
}
