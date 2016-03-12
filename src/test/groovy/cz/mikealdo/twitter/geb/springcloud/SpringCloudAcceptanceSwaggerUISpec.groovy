package cz.mikealdo.twitter.geb.springcloud

import cz.mikealdo.twitter.geb.AcceptanceSwaggerUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev,springCloud")
class SpringCloudAcceptanceSwaggerUISpec extends AcceptanceSwaggerUISpec {
}
