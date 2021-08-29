package com.bridgelabz.testmaximum;

public class TestMaximum {

	public static void main(String[] args) {
		
		Integer integer1=-10, integer2=-3, integer3=-1, maximum;
		maximum = integer1;
		
		if(integer2.compareTo(maximum) > 0)
			maximum=integer2;
		
		if(integer3.compareTo(maximum) > 0)
			maximum=integer3;
		
		System.out.println("Maximum of "+integer1+", "+integer2+" & "+integer3+" is: "+maximum);
		
	}

}
