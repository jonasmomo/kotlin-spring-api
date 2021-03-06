package webservice

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

	@Autowired
	lateinit var restTemplate: TestRestTemplate

	@Test
	fun findAll() {
		val content = """[
			{"firstName":"Kenan","lastName":"CocaCola","sip":"","id":1},
			{"firstName":"Jonas","lastName":"Myrmoen","sip":"","id":2},
			{"firstName":"Kim","lastName":"Els","sip":"","id":3}]"""

		assertEquals(content, restTemplate.getForEntity("/agent", String::class.java).body)
	}

}
