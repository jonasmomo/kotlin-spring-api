package hello

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

	private val log = LoggerFactory.getLogger(Application::class.java) // Bruker ikke denne atm.

	@Bean
	fun init(ar: AgentRepository, cr: CallRepository) = CommandLineRunner { // initierer repos

        ar.save(Agent("Kenan", "CocaCola", ""))
        ar.save(Agent("Kim", "Els", ""))
        ar.save(Agent("Thumæs", "Wålsæfer", ""))


        cr.save(Call("test1", "tlf:123"))
        cr.save(Call("test2", "sip:asd@asd.sd"))
        cr.save(Call("test3", "123"))
	}

}

fun main(args: Array<String>) {
	SpringApplication.run(Application::class.java, *args)
}
