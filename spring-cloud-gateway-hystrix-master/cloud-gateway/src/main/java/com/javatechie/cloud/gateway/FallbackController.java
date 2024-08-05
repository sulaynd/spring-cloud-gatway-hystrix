package com.javatechie.cloud.gateway;

import com.javatechie.cloud.gateway.dto.TransactionResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/orderFallBack")
    //public Mono<String> orderServiceFallBack() {
    public TransactionResponse orderServiceFallBack() {
        //return Mono.just("Order Service is taking too long to respond or is down. Please try again later");
        String response = "Order Service is taking too long to respond or is down. Please try again later";
        return new TransactionResponse(null, 0.0, null, response);
    }
    @RequestMapping("/paymentFallback")
    //public Mono<String> paymentServiceFallBack() {
    public TransactionResponse paymentServiceFallBack() {
       // return Mono.just("Payment Service is taking too long to respond or is down. Please try again later");
        String response = "Payment Service is taking too long to respond or is down. Please try again later";
        return new TransactionResponse(null, 0.0, null, response);
    }
}
