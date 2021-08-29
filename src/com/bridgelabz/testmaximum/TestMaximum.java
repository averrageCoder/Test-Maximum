package com.bridgelabz.testmaximum;

public class TestMaximum {

	public static <E extends Comparable<E>> void findMaximum(E element1, E element2, E element3) {
		E maximum = element1;
		
		if(element2.compareTo(maximum) > 0)
			maximum=element2;
		
		if(element3.compareTo(maximum) > 0)
			maximum=element3;
		
		printMax(element1, element2, element3, maximum);
	}
	
	public static <E> void printMax(E element1,E element2,E element3, E maximum) {
		System.out.println("Maximum of "+element1+", "+element2+" & "+element3+" is: "+maximum);
	}
	
	public static void main(String[] args) {
		
		Integer integer1=-10, integer2=-3, integer3=-1;
		findMaximum(integer1,integer2,integer3);
		
		Float number1=10f, number2=-3f, number3=-1f;
		findMaximum(number1,number2,number3);
		
		String string1="adamX", string2="adam1", string3="adam2";
		findMaximum(string1,string2,string3);
	}

}
