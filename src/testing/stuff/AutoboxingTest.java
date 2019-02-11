package testing.stuff;

public class AutoboxingTest {

	public static void main(String args[]) {

		// Example 1: == comparison pure primitive no autoboxing
		int i1 = 1;
		int i2 = 1;
		System.out.println("i1 == i2 : " + (i1 == i2)); // true

		// Example 2: equality operator mixing object and primitive
		Integer num1 = 1; // autoboxing
		int num2 = 1;
		System.out.println("num1 == num2 : " + (num1 == num2)); // true

		// Example 3: special case - arises due to autoboxing in Java
		Integer obj1 = 1000; // autoboxing will call Integer.valueOf()
		Integer obj2 = 1000; // same call to Integer.valueOf() will return same
							// cached Object

		System.out.println("obj1 == obj2 : " + (obj1 == obj2)); // true

		// Example 4: equality operator - pure object comparison
		Integer one = new Integer(1); // no autoboxing
		Integer anotherOne = new Integer(1);
		System.out.println("one == anotherOne : " + (one == anotherOne)); // false
		
		Integer two = new Integer(1);
		int two2 = 1;
		System.out.println("two == two2 : " + (two == two2)); // true

	}

}