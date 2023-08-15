package com.mystream;
import java.util.stream.Stream;
public class BuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stream<String> s1=Stream.<String>builder()
			.add("BaudeRate")
				.add("ohm")
				.add("kilpwatt")
				.add("bits")
				.add("analog")
				.add("digital")
				.build();
		
		s1.forEach(System.out::println);

	}

}