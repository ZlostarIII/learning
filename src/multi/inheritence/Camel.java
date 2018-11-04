package multi.inheritence;

interface Rideable {
	String getGait();
}

class Animal {

	String type = "a";

	public Animal() {
		System.out.println("Animal");
	}
}

public class Camel extends Animal implements Rideable {
	int weight = 2;

	public Camel() {
		System.out.println("Camel");
	}

	@Override
	public String getGait() {
		return " mph, lope";
	}

	private void go(int speed) {
		++speed;
		weight++;

		int i = speed * weight;
		// System.out.println(i + getGait());

		type = "c ";

		System.out.println(this.type + super.type + ", this object");
	}

	public static void main(String[] args) {
		new Camel().go(8);
	}
}
