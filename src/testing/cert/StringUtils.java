package testing.cert;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StringUtils {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		StringBuilder sb = new StringBuilder("Java");
		String s = "Test";
		sb.append(s);
		sb.substring(4); // doesn't work
		System.out.println(sb);
		System.out.println(sb.indexOf(s + "ing"));

		int i = 0b111_000;
		System.out.println(i);

		long thisIsSilly = 0x3______4__3;
		System.out.println(thisIsSilly);

		int j = 0b00010101;
		System.out.println(j);

		System.out.println(Double.MIN_VALUE);
		System.out.println(-Double.MAX_VALUE);

		/*
		 * Integer objects are cached for values from -128 to 127. This means that when
		 * operating in this range, the == comparison will mostly work correctly. When
		 * going above it though- all bets are off!
		 */
		Integer ten = Integer.parseInt("10");
		System.out.println(ten == Integer.valueOf(10)); // this is true

		Integer thousand = Integer.parseInt("1000");
		System.out.println(thousand == Integer.valueOf(1000)); // this is false

		// REFLECTION ------------------
		Field f = System.class.getDeclaredField("lineSeparator");
		f.setAccessible(true);
		String separator = (String) f.get(System.class);
		System.out.println("Line separator is " + separator + ".");

		f.set(System.class, "!!!");
		System.out.println("Line one");
		System.out.println("Line two");
		System.out.println("Line three");

		// Method m = System.class.getDeclaredMethod("checkPermission");
		// m.setAccessible(true);
		// m.invoke(System.class);

		// Labels
		outerLoop: while (true) {
			System.out.println("I'm the outer loop");
			while (true) {
				System.out.println("I am the inner loop");
				break outerLoop;
			}
		}

		// Double braces initialization of collections
		Map<String, String> map = new HashMap<String, String>() {
			{
				put("it", "really");
				put("works", "!");
			}
		};

		Set<String> set = new HashSet<String>() {
			{
				add("It");
				add("works");
				add("with");
				add("other");
				add("collections");
				add("too");
			}
		};
	}

}
