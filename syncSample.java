package com;
class printNames implements Runnable{
	String[] names= {"Peter","Sam","Edgar","Mathew","Simond"};
	public void run()
	{
		synchronized(this) {
		printArray();}
	}	
	 public void printArray() 
	{ 
	 for(String s:names) 
	{ 
		 System.out.println(s);
	} 
	 }
	}
public class syncSample{
	public static void main(String[] args)
	{
		printNames pn=new printNames();
		Thread p1=new Thread(pn);
		Thread p2=new Thread(pn);
		p1.start();
		p2.start();
	}
}