package com.mystream;
import java.util.*;
import java.util.stream.*;
public class SurveyReportDemo {
	
	public static void main(String[] args)
	{
		List<SurveyReport> survey=new ArrayList<>();
		survey.add(new SurveyReport(1,"peter","hyderabad",10,5,2));
		survey.add(new SurveyReport(2,"erric","hyderabad",15,7,2));
		survey.add(new SurveyReport(3,"jones","mumbai",24,6,4));
		survey.add(new SurveyReport(4,"peter","kerala",8,6,1));
		
		//int i=survey.stream().map((e)->e.getNo_of_days_for_request_completion()).reduce(0, Integer::sum);
		//System.out.println(i);
		
		//int i=survey.stream().map((e)->e.getAverage_request_per_day()).reduce(0, Integer::sum);
		//System.out.println(i);
		//long totalcount=survey.stream().filter(e->e.getLocation().equals("hyderabad")).count();
		//System.out.println(totalcount);
		SurveyReport ds=survey.stream().max((a,b)->{
			if(a.getTotal_connection_request()==b.getTotal_connection_request())
			{
				return 0;
			}
			else if(a.getTotal_connection_request()>b.getTotal_connection_request())
			{
				return 1;
			}
			else {
				return -1;
			}
		}).get();
		System.out.println(ds);
		
	}

}
