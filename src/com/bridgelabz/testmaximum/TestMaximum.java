package com.bridgelabz.testmaximum;

public class TestMaximum {

	public static void main(String[] args) {
		
		String string1="adamX", string2="adam1", string3="adam2", maximum;
		maximum = string1;
		
		if(string2.compareTo(maximum) > 0)
			maximum=string2;
		
		if(string3.compareTo(maximum) > 0)
			maximum=string3;
		
		System.out.println("Maximum of "+string1+", "+string2+" & "+string3+" is: "+maximum);
		
	}

}
