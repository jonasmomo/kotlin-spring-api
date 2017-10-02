package hello

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Call(
        val caller: String,
        val number: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Long = -1) {

    override fun toString(): String {
        return "Call(id=$id, firstName='$caller', lastName='$number')"
    }
}
