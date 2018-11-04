package testing.stuff;

public class PalindromeString {
	static boolean isPalindrome(String str) {

		boolean b = false;
		char[] temp = str.toCharArray();
		String result = "";

		for (int i = 0; i < temp.length; i++) {
			result = temp[i] + result;
		}

		str = str.replaceAll(" ", "").replaceAll(",", "").replaceAll("'", "");
		result = result.replaceAll(" ", "").replaceAll(",", "").replaceAll("'", "");

		System.out.println(str);
		System.out.println(result);

		if (str.equalsIgnoreCase(result)) {
			return true;
		}

		return b;
	}

	public static void main(String[] args) {
		String s1 = "Romaamor";
		System.out.println(isPalindrome(s1));

		String s2 = "I love Java Programming";
		System.out.println(isPalindrome(s2));

		String s3 = "A Santa Lived As a Devil At NASA";
		System.out.println(isPalindrome(s3));

		String s4 = "Madam In Eden, I'm Adam";
		System.out.println(isPalindrome(s4));
	}

}
