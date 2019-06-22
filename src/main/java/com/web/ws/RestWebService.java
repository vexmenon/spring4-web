package com.web.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.model.UserRole;
import com.web.service.UserService;


@RestController
public class RestWebService {

	@Autowired
	UserService userService;
	
	@GetMapping("/fetchuserbyid/{userId}")
	public ResponseEntity<String> fetchUserById(@PathVariable int userId) {
		try {
			UserRole userRole =  userService.fetchUserById(userId);
			return new ResponseEntity<>(userRole.toString(),HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
