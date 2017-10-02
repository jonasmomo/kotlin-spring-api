package webservice

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Agent(
		val firstName: String,
		val lastName: String,
		val sip: String,
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		val id: Long = -1) {

	override fun toString(): String {
		return "Agent(id=$id, firstName='$firstName', lastName='$lastName', sip='$sip')"
	}
}
