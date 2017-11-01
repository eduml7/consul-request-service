package es.paradigmadigital.consulrequest.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consul-request")
public class ConsulRequestController {

	@Autowired
	RestTemplate rest;

	@Autowired
	DiscoveryClient discoveryClient;

	@GetMapping()
	public ResponseEntity<String> getTeamByName(String name) {
		Optional<ServiceInstance> optionalServiceInstance = discoveryClient.getInstances("consul-response-service")
				.stream().findFirst();
		optionalServiceInstance.get().getUri().toString();

		ResponseEntity<String> response = rest.getForEntity("http://consul-response-service/consul-response",
				String.class);

		return response;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@GetMapping(path = "/pito")
	public ResponseEntity<String> getTeddamByName(String name) {
		ResponseEntity<String> response = new ResponseEntity<String>("", HttpStatus.OK);
		return response;
	}
}
