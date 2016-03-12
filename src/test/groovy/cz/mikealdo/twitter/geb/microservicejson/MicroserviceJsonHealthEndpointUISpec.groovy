package cz.mikealdo.twitter.geb.microservicejson

import cz.mikealdo.twitter.geb.HealthEndpointPageUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev")
class MicroserviceJsonHealthEndpointUISpec extends HealthEndpointPageUISpec {
}
