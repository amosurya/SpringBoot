package com.services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.entity.Address;

@Service
public class AddressServices implements IAddressServices {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Override
	public List<Address> getEmpAddress() {
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        
        
		Address address = new Address();
		address.setAddress1("new sangvi");
		address.setCity("Pune");
		address.setPincode("416410");
		address.setAddress_id(1);
		
		Address address1 = new Address();
		address1.setAddress1("dange chowk");
		address1.setCity("primpri");
		address1.setPincode("4444444");
		address1.setAddress_id(2);
	
		List<Address> addresses = new ArrayList<Address>(); 
		addresses.add(address);
		addresses.add(address1);
		
		return addresses;
	}
}
