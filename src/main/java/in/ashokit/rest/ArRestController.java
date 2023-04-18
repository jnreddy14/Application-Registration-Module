package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.CreateApp;
import in.ashokit.service.CreateAppServiceInterface;


@RestController
public class ArRestController {
	
	@Autowired
	CreateAppServiceInterface service;
	
	@PostMapping("/app")
	public ResponseEntity<String> createApp(@RequestBody CreateApp createApp){
		Integer integer = service.createApp(createApp);
		if (integer> 0) {
			return new ResponseEntity<>("Application is created. your id is  " +integer, HttpStatus.CREATED);
		}else
			return new ResponseEntity<>("invalid ssn", HttpStatus.BAD_REQUEST);
	}

}
