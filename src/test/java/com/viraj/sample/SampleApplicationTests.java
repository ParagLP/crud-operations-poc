package com.viraj.sample;

import com.viraj.sample.entity.Employee;
import com.viraj.sample.service.EmployeeServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SampleApplicationTests {

	@Autowired
	EmployeeServiceImpl empl;

	@Test
	public void contextLoads()
	{
	}

	@Test
	public void getbyIdTest()
	{
		   Employee e1=empl.getEmployee(1L);
		   assertEquals("som",e1.getEmployeeName());
		  // assertEquals("tom",e1.getEmployeeName());
	}

	@Test
	public void getbyNameTest()
	{
		List<Employee> e2= empl.getEmployeeByName("som");
		assertEquals(1,e2.size());


	}



}
