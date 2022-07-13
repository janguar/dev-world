package it.corso.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		Method1();
		Method2();
		Calculator c = new Calculator();
		System.out.println(c.Mul((double)10, (double)10));
	}
	
	private static void Method1() {
		System.out.println("Method 1");
	}
	
	private static void Method2() {
		System.out.println("Method 2");
	}

}