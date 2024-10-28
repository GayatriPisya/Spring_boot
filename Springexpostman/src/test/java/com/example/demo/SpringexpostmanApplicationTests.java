package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.Model.EmployeeModel;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.Services.EmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringexpostmanApplicationTests {
	
	@Autowired
	private EmployeeService employeeService;
	@MockBean
	private EmployeeRepository employeeRepo;

//	@Test
//	void contextLoads() {
//	}
//	@Test
//	public void testCount()
//	{
//		assertEquals(3,2+2);
//	}
	
	@Test
	public void getEmployeeTest()
	{
		when(employeeRepo.findAll()).thenReturn(Stream.of(new EmployeeModel("Pisya","Gayatri","gayatripisya@gmail.com","Totagummada"),new EmployeeModel()).collect(Collectors.toList()));
		assertEquals(2,employeeService.getAllEmployees().size());
	}
}
