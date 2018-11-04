package testing.stuff;

public class ToUpper {
	public static void main(String[] args) {
		String s = "sveTLio ne moJE DA ReShI eleMenTarni ZadaCHi";
		s = s.toLowerCase();
		
		int i = 053;
		System.out.println(i);
		
		int a[][] = new int[3][];
		a[1] = new int[]{1,2,3};
		a[2] = new int[]{4,5};
		System.out.println(a[1][1]);
		
		String jav = "Java".concat(" SE 6").replace("6", "7");
		System.out.println(jav.hashCode());
//		jav = jav.replace("6", "7");
//		jav = jav.replace('6', '8');
//		jav = jav.replace('J', 'I');
//		jav = jav.toLowerCase();
		System.out.println(jav);

		String[] arr = s.split(" ");

		StringBuilder sb = new StringBuilder();

		int index = 1;
		for (String each : arr) {
			if (index != arr.length) {
				sb.append(each.substring(0, 1).toUpperCase()).append(each.substring(1, each.length())).append(" ");
			} else {
				sb.append(each.substring(0, 1).toUpperCase()).append(each.substring(1, each.length()));
			}
			index++;
		}

		System.out.println(sb);
		
		new ToUpper().print();
	}

	private void print() {
		int a = 8;
		System.out.println(a + " ");
	}
}
