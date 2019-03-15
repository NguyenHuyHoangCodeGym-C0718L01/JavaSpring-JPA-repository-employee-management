package com.codegym.cms.service;

import com.codegym.cms.model.Employee;
import com.codegym.cms.repository.DepartmentRepository;
import com.codegym.cms.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findOne(id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void remove(Long id) {
        employeeRepository.delete(id);
    }

    @Override
    public Page<Employee> findAll(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Page<Employee> findAllByDepartment(String department, Pageable pageable) {
        return employeeRepository.findAllByDepartmentName(department, pageable);
    }

    @Override
    public Page<Employee> findAllByName(String name, Pageable pageable) {
        return employeeRepository.findAllByName(name, pageable);
    }

    @Override
    public Page<Employee> findAllByNameAndDepartment(String name, long departmentId, Pageable pageable) {
        return employeeRepository.findAllByNameAndDepartmentId(name, departmentId, pageable);
    }
}
