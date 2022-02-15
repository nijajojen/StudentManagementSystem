package com.kgs.tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer>{

	@Query("select distinct T1 from Menu as T1 inner join T1.menuRoleMapList as T2 inner join T2.role as T3 inner join T3.deptRoleMapList as T4 inner join T4.department as T5 inner join T5.userDepartmentMapList as T6 where T6.user.id = ?1 and T6.department.id = ?2")
	List<Menu> findMenusByUserIdAndDeptId(Integer userId, Integer deptId);
	
	 

}
