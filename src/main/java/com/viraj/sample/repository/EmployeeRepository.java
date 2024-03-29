package com.viraj.sample.repository;

import com.viraj.sample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository <Employee,Long>{

    List<Employee> findByEmployeeName(String employeeName);
}
