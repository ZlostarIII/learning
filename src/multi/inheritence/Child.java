package multi.inheritence;

public class Child extends Dad implements Dad1, Dad2, Dad3 {

    public int a = 20;

    @Override
    public void getString() {
//        Dad1.super.getString();
        Dad1.shout();
        Dad1.parenthood();
        super.parenthood(); // points to Dad
        super.getString();
        Dad2.super.getString();
        Dad3.super.getString();
    }

    public void childhood() {
        System.out.println("I am the child");
    }

    public void speak() {
        System.out.println("Child is speaking");
    }

    @Override
    public void kickBall() {
        System.out.println("Child kicked the ball");
    }

    public static void parenthood() {
        System.out.println("Dad is my parent");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.getString();
        c.speak();
        c.childhood();
        Child.parenthood();

        Dad d = new Dad();
        d.speak();
        Dad.parenthood();

        Dad d2 = new Child();
        ((Child) d2).kickBall();
        ((Child) d2).parenthood();
        d2.speak();
        d2.getA();
        System.out.println(d2.a);
    }

    @Override
    public int getA() {
        System.out.println("Child int a: " + a);
        return a;
    }
}
