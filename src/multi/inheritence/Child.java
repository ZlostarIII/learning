package multi.inheritence;

import java.util.Objects;

public class Child extends Dad implements Dad1, Dad2, Dad3 {

    private static Child child = null;

    public static int a = 20;

    public static String staticStr = "Static child string variable";

    public String s;

    private Child() {
//    public Child() {
        this.s = "Non-static Child constructor string variable";
        System.out.println("Inside the Child constructor: " + s);
    }

    public static Child getChildInstance() {
        if (child == null) {
            child = new Child();
        }

        return child;
    }

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
        Child c = Child.getChildInstance();

//        c.getString();
//        c.speak();
//        c.childhood();
//        Child.parenthood();

        System.out.println(c.staticStr);
        System.out.println(c.s);

        c.staticStr = "Static string setting execution";
        c.s = "Changing S as well"; // Should not work

        Child c2 = Child.getChildInstance();
        System.out.println("c2 staticStr: " + c2.staticStr);
        System.out.println("c staticStr: " + c.staticStr);
        System.out.println("c2 s: " + c2.s);
        System.out.println("c s: " + c.s);

//        Dad d = new Dad();
//        d.speak();
//        Dad.parenthood();
//
//        Dad d2 = new Child();
//        ((Child) d2).kickBall();
//        ((Child) d2).parenthood();
//        d2.speak();
//        d2.getA();
//        System.out.println(d2.a);
    }

    @Override
    public int getA() {
        System.out.println("Child int a: " + a);
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Child child = (Child) o;
        return Objects.equals(s, child.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s);
    }

    @Override
    public String toString() {
        return "Child{" +
                "s='" + s + '\'' +
                '}';
    }
}
