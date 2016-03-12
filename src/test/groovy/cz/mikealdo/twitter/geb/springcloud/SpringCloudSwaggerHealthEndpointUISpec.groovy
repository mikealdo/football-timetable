package cz.mikealdo.twitter.geb.springcloud

import cz.mikealdo.twitter.geb.SwaggerHealthEndpointUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev,springCloud")
class SpringCloudSwaggerHealthEndpointUISpec extends SwaggerHealthEndpointUISpec {

}
