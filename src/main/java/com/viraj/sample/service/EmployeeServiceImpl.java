package com.viraj.sample.service;

import com.viraj.sample.entity.Employee;
import com.viraj.sample.exception.DuplicateRecordException;
import com.viraj.sample.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) throws DuplicateRecordException
    {
        Optional<Employee> existo=employeeRepository.findById(employee.getEmployeeId());

        Employee e1=new Employee();
        System.out.println(employee.getEmployeeName()+""+employee.getEmployeeDescription());

            if (existo.isPresent())
            {
                try
            {
                throw new DuplicateRecordException("User already exists");
            }
                catch(Exception e)

                {
                    e.printStackTrace();
                }
                  //  throw new DuplicateRecordException("User already exists");
            }

                //throw new DuplicateRecordException("User already exists");

            else
            {
                 e1.setEmployeeId(employee.getEmployeeId());
                 e1.setEmployeeName(employee.getEmployeeName());
                 e1.setEmployeeDescription(employee.getEmployeeDescription());

            }


                return employeeRepository.save(e1);



        //return employeeRepository.save(employee);

    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }


    @Override
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        employeeRepository.deleteById(employeeId);
    }

    @Override
    public List<Employee> getEmployeeByName(String employeeName) {
       return employeeRepository.findByEmployeeName(employeeName);
    }
}
