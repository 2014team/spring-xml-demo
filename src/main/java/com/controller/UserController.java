
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bean.User;
import com.bean.User2;
import com.thoughtworks.xstream.XStream;

@Controller
public class UserController {
	@ResponseBody
	@RequestMapping("/jdk/xml.do")
	public User jdkXML() {
		User user = new User();
		user.setName("name");
		user.setPassword("password");
		return user;
	}
	
	@RequestMapping(value="/jar/xml.do", produces={"application/xml; charset=UTF-8"})
	@ResponseBody
	public String JarXml() {
		User2 user = new User2();
		user.setName("name");
		user.setPassword("password");
		XStream xStream = new XStream();
		xStream.alias("user", User2.class);
		String xml = xStream.toXML(user);

		return xml;
	}
}
