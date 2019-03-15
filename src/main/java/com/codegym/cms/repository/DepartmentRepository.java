package com.codegym.cms.repository;

import com.codegym.cms.model.Department;
import com.codegym.cms.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, Long> {

    @Query("select d from Department d where d.name=?1")
    Department findByName(String departmentName);
}
