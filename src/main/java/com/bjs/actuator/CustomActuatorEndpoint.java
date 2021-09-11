package com.bjs.actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Endpoint(id = "myEndpoint")
@Component
public class CustomActuatorEndpoint {
	
@ReadOperation
public Map<String,String> customEndPoint(String username){
	Map<String,String> map = new HashMap<String,String>();
	map.put("Name", username);
	map.put("Id", username.substring(0,2)+"-1 ");
	return map;
}
}
