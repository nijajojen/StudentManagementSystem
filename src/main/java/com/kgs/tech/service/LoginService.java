package com.kgs.tech.service;

import java.util.List;

import com.kgs.tech.dto.DepartmentDto;
import com.kgs.tech.dto.UserDto;

public interface LoginService {

	UserDto findUserByUsernameAndPassword(String username, String password);

	List<DepartmentDto> findDepartmentListByUserId(Integer id);

}
