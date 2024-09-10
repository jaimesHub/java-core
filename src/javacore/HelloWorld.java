package javacore;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello World");
//		System.out.printf("Hello World");
		System.out.printf("Hello World %dnth", 1000);
		System.out.printf("Hello World %.3f nth", 40.1235312);

		String name = "James";
		int age = 28;

		System.out.printf("\nMy name is %s, age = %d\n", name, age);
		System.out.println("My name is " + name + ", age = " + age);
	}
}
