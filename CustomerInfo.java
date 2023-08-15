package com.mystream;
import java.util.*;
import java.util.stream.*;
public class CustomerInfo {
	
	public static void main(String[] args)
	{
		ArrayList<Customer> list=new ArrayList();
		list.add(new Customer("Peter","london","X",2,320));
		list.add(new Customer("Erric","paris","Y",5,620));
		list.add(new Customer("Jones","US","Z",4,500));
		list.add(new Customer("Alex","US","W",1,220));
		
		Stream<Customer> stream=list.stream();
		//stream.filter((e)->e.getPlanRange()>3).forEach(System.out::println);
		//stream.filter((e)->e.getAmount()>400).forEach(System.out::println);
		//System.out.println(stream.allMatch((e)->e.getPlanRange()>3));
		//System.out.println(stream.anyMatch((e)->e.getPlanRange()>1));
		stream.filter((e)->e.getLocation().equals("US")).map((e)->(e.getAmount()*0.8f)+" "+e.getLocation()).forEach(System.out::println);
		
		
	}

}