package com.springrest.SpringRestDemo.restController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.SpringRestDemo.Dto.LoginDto;

@RestController
@RequestMapping("api/vi")
public class SpringRestController {
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public ResponseEntity<String> testService(){
		return new ResponseEntity<String>("Welcome",HttpStatus.OK);
	}
	
	@RequestMapping(value="/verifyLogin",method=RequestMethod.POST)
	public ResponseEntity<Boolean> verifyLogin(@RequestBody LoginDto loginDto){
		Boolean isVerified=false;
		
		if(loginDto.getUserName().equalsIgnoreCase("Monikha") && loginDto.getPassword().equalsIgnoreCase("test"))
			isVerified=true;
		
		if(isVerified)
			return new ResponseEntity<Boolean>(isVerified,HttpStatus.OK);
		else
			return new ResponseEntity<Boolean>(isVerified,HttpStatus.UNAUTHORIZED);
	}
	
}
