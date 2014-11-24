package pl.mjasion.idea

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(locations = ["classpath:/spring/test.ioc.xml"])
class SetupSpec extends Specification {

    @Autowired ApplicationContext applicationContext

    def 'should run unit spec'() {
        expect:
        true
    }

    def 'should setup spring context'() {
        expect:
        applicationContext != null
    }
}
