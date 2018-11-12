package multi.inheritence;

class Alpha {
	String getType() {
		return "alpha ";
	}
}

class Beta extends Alpha {
	String getType() {
		return "beta ";
	}
}

public class Gamma extends Beta {
	String getType() {
		return "gamma ";
	}
	
	public static void main(String[] args) {
		Alpha a = new Alpha();
		Alpha g1 = new Beta();
		Alpha a1 = g1;
		Beta g2 = new Gamma();
		System.out.println(g1.getType() + g2.getType() + a1.getType());
		
		System.out.println(a instanceof Beta);
		System.out.println(g1 instanceof Beta);
		System.out.println(a1 instanceof Beta);
		System.out.println(g2 instanceof Beta);
		System.out.println(g2 instanceof Gamma);

	}
}
