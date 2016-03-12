package cz.mikealdo.twitter.geb.microservicejson

import cz.mikealdo.twitter.geb.SwaggerHealthEndpointUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev")
class MicroserviceJsonSwaggerHealthEndpointUISpec extends SwaggerHealthEndpointUISpec {
}
