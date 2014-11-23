package pl.mjasion.idea.presentation

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping('/')
    String hello() {
        return 'hello'
    }

}
