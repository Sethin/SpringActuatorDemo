package com.bjs.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;
@Component
public class LoggerService implements HealthIndicator{

	private final String loggerService = "Logger Service";
	public boolean isLoggerServiceGood() {
		return true;
	}
	
	@Override
	public Health health() {
		// TODO Auto-generated method stub
		if(isLoggerServiceGood()) {
			return Health.up().withDetail(loggerService,"Logger Service is running...").build();
		}
		
		return Health.up().withDetail(loggerService, "Logger Service is down...").build();
	}

}
