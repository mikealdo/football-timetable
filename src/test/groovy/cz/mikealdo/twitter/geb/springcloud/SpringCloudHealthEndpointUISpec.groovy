package cz.mikealdo.twitter.geb.springcloud

import cz.mikealdo.twitter.geb.HealthEndpointPageUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev,springCloud")
class SpringCloudHealthEndpointUISpec extends HealthEndpointPageUISpec {
}
