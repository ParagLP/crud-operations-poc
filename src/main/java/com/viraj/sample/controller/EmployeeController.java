package com.viraj.sample.controller;

import com.viraj.sample.entity.Employee;
import com.viraj.sample.exception.DuplicateRecordException;
import com.viraj.sample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee/")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/")
    public String getMessage() {
        return "Hello boot";
    }

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee) throws  DuplicateRecordException {

        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        return employeeService.getEmployee(employeeId);
    }


    @GetMapping("/getbyname/{employeeName}")
    public List<Employee> getEmployeeByName(@PathVariable(name = "employeeName") String employeeName) {
        return employeeService.getEmployeeByName(employeeName);
    }

    @DeleteMapping("/{employeeId}")
    public void deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
        employeeService.deleteEmployee(employeeId);
    }
}
