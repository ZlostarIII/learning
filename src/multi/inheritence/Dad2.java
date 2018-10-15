package multi.inheritence;

public interface Dad2 extends GrandDad {

	@Override
	default void getString() {
		System.out.println("dad 2");
	}
	
}
