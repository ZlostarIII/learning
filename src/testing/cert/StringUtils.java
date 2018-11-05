package testing.cert;

public class StringUtils {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		String s = "Test";
		sb.append(s);
		sb.substring(4); // doesn't work
		System.out.println(sb);
		System.out.println(sb.indexOf(s + "ing"));

		int i = 0111_000;
		System.out.println(i);
	}

}
