package pl.mjasion.idea.props

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration(locations = ["classpath:/spring/test.ioc.xml"])
class PropsServiceSpec extends Specification {

    @Autowired
    PropsService propsService

    def 'should get prop which.directory value from test resources'() {
        when:
        def propValue = propsService.directory

        then:
        propValue == 'directory.test'
    }

}
