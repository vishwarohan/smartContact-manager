package com.smart.smartContactManager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.smartContactManager.dao.UserRepository;
import com.smart.smartContactManager.entities.User;

@Controller
public class homeController {
	
	@Autowired(required =true)
	private UserRepository userRepository;
	
	@GetMapping("/test")
	@ResponseBody
	public String test() {
		User user = new User();
		user.setName("Rohan vishwakarma");
		user.setEmail("rohangmail.com");
		userRepository.save(user);
		return "working";
	}

}
