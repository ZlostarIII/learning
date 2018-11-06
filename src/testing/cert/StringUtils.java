package testing.cert;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class StringUtils {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException,
			IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		StringBuilder sb = new StringBuilder("Java");
		String s = "Test";
		sb.append(s);
		sb.substring(4); // doesn't work
		System.out.println(sb);
		System.out.println(sb.indexOf(s + "ing"));

		int i = 0111_000;
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

//		Method m = System.class.getDeclaredMethod("checkPermission");
//		m.setAccessible(true);
//		m.invoke(System.class);
	}

}
