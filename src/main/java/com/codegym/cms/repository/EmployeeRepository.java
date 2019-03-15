package com.codegym.cms.repository;

import com.codegym.cms.model.Employee;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;
import org.springframework.data.domain.Page;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {
    Page<Employee> findAllByDepartmentName(String department, Pageable pageable);

    Page<Employee> findAllByName(String name, Pageable pageable);

    Page<Employee> findAllByNameAndDepartmentId(String name, long departmentId, Pageable pageable);
}
