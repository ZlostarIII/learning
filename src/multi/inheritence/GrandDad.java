package multi.inheritence;

public interface GrandDad {

	default void getString() {
		System.out.println("granny");
	}

}
