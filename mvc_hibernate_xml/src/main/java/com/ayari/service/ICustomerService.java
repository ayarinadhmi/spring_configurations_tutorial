package com.ayari.service;

import java.util.List;

import com.ayari.entity.Customer;

public interface ICustomerService {
	 	public List <Customer> getCustomers();

	    public void saveCustomer(Customer theCustomer);

	    public Customer getCustomer(int theId);

	    public void deleteCustomer(int theId);
}
