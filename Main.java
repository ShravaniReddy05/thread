package com;
import java.util.Scanner;

class details extends Thread{
    public void run()
    {
    	Scanner sc=new Scanner(System.in);
        System.out.println("Name : ");
        String name=sc.next();
        System.out.println("EmailId : ");
        String email=sc.next();
        System.out.println("Name: "+name+" emailId : "+email);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        details ds=new details();
        ds.start();
        
        simpleinterest si=new simpleinterest();
        si.start();
        
        
    }
}