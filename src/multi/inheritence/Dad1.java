package multi.inheritence;

public interface Dad1 extends GrandDad {

	default void getString() {
		System.out.println("dad 1");
	}
	
}
