package com.kgs.tech.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kgs.tech.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	@Query("select distinct T1 from Department as T1 inner join T1.userDepartmentMapList as T2 where T2.user.id = ?1")
	List<Department> findDepartmentListByUserId(Integer id);

}
