package com.bridgelabz.testmaximum;

public class TestMaximum {

	public static void main(String[] args) {
		
		Float number1=10f, number2=-3f, number3=-1f, maximum;
		maximum = number1;
		
		if(number2.compareTo(maximum) > 0)
			maximum=number2;
		
		if(number3.compareTo(maximum) > 0)
			maximum=number3;
		
		System.out.println("Maximum of "+number1+", "+number2+" & "+number3+" is: "+maximum);
		
	}

}
