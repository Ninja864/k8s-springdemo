package com.redbox.springdocker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.redbox.springdocker.serverinfo.ServerInformationService;

@RestController
public class RedboxApplicationController {
	
	@Autowired
	private ServerInformationService serverInfo;
	
	@GetMapping(path = "/test/k8s")
	public String dockerHelloWorld() {
		return "Hello Ninja welcome to K8s Demo";
	}

}
