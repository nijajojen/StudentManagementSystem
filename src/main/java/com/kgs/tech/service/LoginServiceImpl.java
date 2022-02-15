package com.kgs.tech.service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgs.tech.dto.DepartmentDto;
import com.kgs.tech.dto.MenuDto;
import com.kgs.tech.dto.UserDto;
import com.kgs.tech.entity.Department;
import com.kgs.tech.entity.Menu;
import com.kgs.tech.entity.User;
import com.kgs.tech.repository.DepartmentRepository;
import com.kgs.tech.repository.MenuRepository;
import com.kgs.tech.repository.UserRepository;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
    private UserRepository userRepository;
	@Autowired
	private DepartmentRepository departmentRepository;
	@Autowired
	private MenuRepository menuRepository;

	@Override
	public UserDto findUserByUsernameAndPassword(String username, String password) {
		
		try {
			User user = userRepository.findByUsernameAndPassword(username,md5(password));
			
			
			if(user == null) {
				return null;
			}else {
				UserDto userDto = new UserDto();
				
				BeanUtils.copyProperties(user, userDto);
				
				return userDto;
			}
		}catch(Exception e) {
			return null;
		}
		
	}
	
	
	private String md5(String password) throws Exception{
		
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashInBytes = md.digest(password.getBytes(StandardCharsets.UTF_8));

        StringBuilder sb = new StringBuilder();
        for (byte b : hashInBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
	}


	@Override
	public List<DepartmentDto> findDepartmentListByUserId(Integer userId) {
		try {
			List<Department> departmentList = departmentRepository.findDepartmentListByUserId(userId);
			
			List<DepartmentDto> departmentDtos = new ArrayList<DepartmentDto>();
			
			if(!(departmentList == null || departmentList.size() == 0)) {
				for(Department department : departmentList ){
					DepartmentDto departmentDto = new DepartmentDto();
					departmentDto.setId(department.getId());
					departmentDto.setDepartmentName(department.getDepartmentName());
					departmentDto.setActiveFlag(department.getActiveFlag());
					departmentDto.setCreatedBy(department.getCreatedBy());
					departmentDto.setCreatedDate(department.getCreatedDate());
					departmentDto.setDeleteFlag(department.getDeleteFlag());
					departmentDto.setModifiedBy(department.getModifiedBy());
					departmentDto.setModifiedDate(department.getModifiedDate());
					
					
					List<Menu> menuList =  menuRepository.findMenusByUserIdAndDeptId(userId,department.getId());
					
					List<MenuDto> menuDtoList = new ArrayList<MenuDto>();
					
					if(!(menuList == null || menuList.size() == 0)) {
						for(Menu menu : menuList) {
							MenuDto menuDto = new MenuDto();
							menuDto.setId(menu.getId());
							menuDto.setActiveFlag(menu.getActiveFlag());
							menuDto.setCreatedBy(menu.getCreatedBy());
							menuDto.setCreatedDate(menu.getCreatedDate());
							menuDto.setDeleteFlag(menu.getDeleteFlag());
							menuDto.setMenuName(menu.getMenuName());
							menuDto.setMenuUrl(menu.getMenuUrl());
							menuDto.setModifiedBy(menu.getModifiedBy());
							menuDto.setModifiedDate(menu.getModifiedDate());
							
							
							menuDtoList.add(menuDto);
							
							
						}
					}
					
					departmentDto.setMenuDtoList(menuDtoList);
					
					departmentDtos.add(departmentDto);
				}
			}
			
			
			
			return departmentDtos;
		}catch(Exception e) {
			return null;
		}
		
	}

}
