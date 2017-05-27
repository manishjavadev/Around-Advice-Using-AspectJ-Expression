package com.manish.javadev.servie;

import java.util.List;

import com.manish.javadev.model.CustomerBean;

public interface CustomerService {
	public CustomerBean findCustomerById(Integer custId);

	public List<CustomerBean> findAllCustomer();

	public void createCustomer(CustomerBean customer);

	public void deleteCustomer(Integer custId);

	public void updateCustomer(CustomerBean customer);
}
