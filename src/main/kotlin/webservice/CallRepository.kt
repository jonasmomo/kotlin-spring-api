package webservice

import org.springframework.data.repository.CrudRepository

interface CallRepository : CrudRepository<Call, Long> {

    fun findByCaller(caller: String): Iterable<Call>
    

}
