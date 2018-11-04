package testing.stuff;

public class ArraysTask15 {

	public static float findMax(float[] a, int index) {
		if (index >= a.length) {
			return Integer.MIN_VALUE;
		}

		float max = findMax(a, index + 1);

		if (a[index] > max) {
			return a[index];
		}

		return max;

	}

	public static float findMin(float[] a, int index) {
		if (index >= a.length) {
			return Integer.MAX_VALUE;
		}

		float min = findMin(a, index + 1);

		if (a[index] < min) {
			return a[index];
		}

		return min;
	}
	
	public static void minMax(float[] a, int index, float min, float max) {
		if (index == a.length) {
			System.out.println("min: " + min);
			System.out.println("max: " + max);
			System.out.println(max-min);
			return;
		}

		if (a[index] < min) {
			min = a[index];
		}
		
		if (a[index] > max) {
			min = a[index];
		}
		
		minMax(a, index + 1, min, max);
	}

	public static void main(String[] args) {

		float[] a = { 7.13f, 0.2f, 4.9f, 5.1f, 6.34f, 1.12f };

		System.out.println(findMin(a, 0));
		System.out.println(findMax(a, 0));
		System.out.println(findMax(a, 0) - findMin(a, 0));
		minMax(a, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);

	}

}