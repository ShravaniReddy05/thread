package com.mystream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class CustomerLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Customer1> customer=new ArrayList<>();
		customer.add(new Customer1("john","H","john@gmail.com",new Location("hyderabad","Telanagana")));
		customer.add(new Customer1("Mary","J","mary@gmail.com",new Location("Warangal","Telangana")));
		
		List<String> customers=customer.stream().map((e)->e.getFirstName()+" "+e.getLastName()+" "+e.getLocation()).collect(Collectors.toList());
        System.out.println(customers);
	}

}