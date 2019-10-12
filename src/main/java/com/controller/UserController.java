
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.User;

@Controller
public class UserController {
	@ResponseBody
	@RequestMapping("/xml")
	public User demo() {
		User user = new User();
		user.setName("name");
		user.setPassword("password");
		return user;
	}
}
