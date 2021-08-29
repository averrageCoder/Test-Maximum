package com.bridgelabz.testmaximum;

public class TestMaximum<E extends Comparable<E>> {
	
	E element1, element2, element3;

	public TestMaximum(E element1, E element2, E element3) {
		this.element1 = element1;
		this.element2 = element2;
		this.element3 = element3;
	}
	
	public void findMaximum() {
		TestMaximum.findMaximum(element1, element2, element3);
	}

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
		Float number1=10f, number2=-3f, number3=-1f;
		String string1="adamX", string2="adam1", string3="adam2";
		
		System.out.println("USING GENERIC METHOD: ");
		
		TestMaximum.findMaximum(integer1,integer2,integer3);
		TestMaximum.findMaximum(number1,number2,number3);
		TestMaximum.findMaximum(string1,string2,string3);
		
		System.out.println("\nUSING GENERIC CLASS: ");
		
		new TestMaximum(integer1, integer2, integer3).findMaximum();
		new TestMaximum(number1, number2, number3).findMaximum();
		new TestMaximum(string1, string2, string3).findMaximum();
	}

}
