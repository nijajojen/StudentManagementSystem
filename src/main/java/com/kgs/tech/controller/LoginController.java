package com.kgs.tech.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kgs.tech.dto.DepartmentDto;
import com.kgs.tech.dto.UserDto;
import com.kgs.tech.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/")
	public String gotoLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="/validateUser")
	public String validateUser(Model model,HttpSession session,@RequestParam("username")String username,@RequestParam("password")String password) {
		
		
		
		UserDto userDto = loginService.findUserByUsernameAndPassword(username,password);
		
		if(userDto == null) {
			return "redirect:?msg=Invalid credential!";
		}else {
			
			List<DepartmentDto> departmentDtoList = loginService.findDepartmentListByUserId(userDto.getId());
			
			session.setAttribute("departmentDtoList",departmentDtoList);
			
			session.setAttribute("userDto", userDto);
			
			
			return "dashboard";
		}
		
		
	}
	

}

