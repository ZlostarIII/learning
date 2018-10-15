package testing.stuff;

public class HashTest {

	public static void main(String[] args) {
		System.out.println(hash());
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
}
