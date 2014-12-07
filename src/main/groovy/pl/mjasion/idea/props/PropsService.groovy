package pl.mjasion.idea.props

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class PropsService {
    @Value('${which.directory}')
    String directory
}
