package org.craftchain.market.gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/userFallBack")
    public Mono<String> userServiceFallBack() {
        return Mono.just("User service is taking too long to respond or is down. Please try again later!");
    }

    @RequestMapping("/orderFallBack")
    public Mono<String> orderServiceFallBack() {
        return Mono.just("Order service is taking too long to respond or is down. Please try again later!");
    }

    @RequestMapping("/paymentFallBack")
    public Mono<String> paymentServiceFallBack() {
        return Mono.just("Payment service is taking too long to respond or is down. Please try again later!");
    }
}
