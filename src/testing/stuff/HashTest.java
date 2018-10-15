package testing.stuff;

public class HashTest {

	public static void main(String[] args) {
		System.out.println(hash());
		
		System.out.println(areEqual(new HashClass("a"), new HashClass("a")));
		System.out.println(new HashClass("a").hashCode());
		System.out.println(new HashClass("a").hashCode());
		System.out.println(new HashClass("b").hashCode());
	}

	public static int hash() {
		final int prime = 31;
		int result = 1;
		double price = 2.13;

		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));

		System.out.println(temp);
		System.out.println(temp >>> 32);
		System.out.println(temp ^ (temp >>> 32));

		return result;
	}
	
	public static boolean areEqual(HashClass h1, HashClass h2) {
		return h1.hashCode() == h2.hashCode();
	}
}
