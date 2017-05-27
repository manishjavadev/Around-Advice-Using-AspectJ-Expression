package com.manish.javadev.manager;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manish.javadev.model.CustomerBean;
import com.manish.javadev.servie.CustomerService;

public class SpringDemo {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerService manager = (CustomerService) context.getBean("custService");

		CustomerBean empDto = manager.findCustomerById(100);
		System.out.println("Customer Bean in Main :" + empDto);
		List<CustomerBean> empDtoList = manager.findAllCustomer();
		System.out.println("Size Of return list = " + empDtoList.size());
		for (CustomerBean employeeDTO : empDtoList) {
			System.out.println(employeeDTO);
		}
	}
}