package com.viraj.sample.service;

import com.viraj.sample.entity.Employee;
import com.viraj.sample.exception.DuplicateRecordException;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee) throws DuplicateRecordException;
    Employee updateEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployee(Long employeeId);
    void deleteEmployee(Long employeeId);

    List<Employee> getEmployeeByName(String employeeName);
}
