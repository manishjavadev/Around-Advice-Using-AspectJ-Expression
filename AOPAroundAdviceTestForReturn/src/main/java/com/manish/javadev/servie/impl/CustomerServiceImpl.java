package com.manish.javadev.servie.impl;

import java.util.ArrayList;
import java.util.List;

import com.manish.javadev.model.CustomerBean;
import com.manish.javadev.servie.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	public CustomerBean getCustomerById(Integer custId) {
		System.out.println("Method getCustomerById() called");
		return new CustomerBean(custId, "Manish", 30);
	}

	public List<CustomerBean> getAllCustomer() {
		List<CustomerBean> empDtoList = new ArrayList<CustomerBean>();
		CustomerBean empDto1 = new CustomerBean(100, "Manish", 30);
		empDtoList.add(empDto1);
		empDtoList.add(empDto1);
		empDtoList.add(empDto1);
		System.out.println("Method getAllCustomer() called");
		return empDtoList;
	}

	public void createCustomer(CustomerBean customer) {
		System.out.println("Method createCustomer() called");
	}

	public void deleteCustomer(Integer custId) {
		System.out.println("Method deleteCustomer() called");
	}

	public void updateCustomer(CustomerBean customer) {
		System.out.println("Method updateCustomer() called");
	}
}