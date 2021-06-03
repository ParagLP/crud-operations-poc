package com.viraj.sample;

import com.viraj.sample.entity.Employee;
import com.viraj.sample.repository.EmployeeRepository;
import com.viraj.sample.service.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest

public class SampleMocking {

    @Autowired
    EmployeeServiceImpl empl;

    @MockBean
    EmployeeRepository employeeRepository;

    @Test
    public void contextLoads()
    {
    }

    @Test
    public void getEmployeeIdTest()
    {
        Employee e11=new Employee("Raj","CEO");
        when(employeeRepository.findById(1L)).thenReturn(java.util.Optional.of(e11));

    }
}
