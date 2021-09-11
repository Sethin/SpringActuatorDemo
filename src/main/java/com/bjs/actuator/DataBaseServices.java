package com.bjs.actuator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class DataBaseServices implements HealthIndicator {
public final String dataBaseService = "Database Service";
	
	public boolean isDataBaseHealthGood() {
		return true;
	}
	
	@Override
	public Health health() {
		// TODO Auto-generated method stub
		if(isDataBaseHealthGood())
		return Health.up().withDetail(dataBaseService, "Sevice is running...").build();
		
		return Health.down().withDetail(dataBaseService, "Service is down..").build();
	}

}
