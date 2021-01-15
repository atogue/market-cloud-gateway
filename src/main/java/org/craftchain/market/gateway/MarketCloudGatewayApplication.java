package org.craftchain.market.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MarketCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketCloudGatewayApplication.class, args);
	}

}
