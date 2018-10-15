package multi.inheritence;

public interface Dad3 extends GrandDad {

	@Override
	default void getString() {
		GrandDad.super.getString();
	}

}
