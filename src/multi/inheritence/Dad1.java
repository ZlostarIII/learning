package multi.inheritence;

public interface Dad1 extends GrandDad {

    default void getString() {
        System.out.println("dad 1");
    }

    static void shout() {
        System.out.println("Dad 1 shouting");
    }

    void kickBall();

    static void parenthood() {
        System.out.println("Dad 1: Child is my ancestor");
    }
}
