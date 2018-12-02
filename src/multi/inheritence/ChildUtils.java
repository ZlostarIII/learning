package multi.inheritence;

public class ChildUtils {

    public static void main(String[] args) {
        Child c = Child.getChildInstance();

        System.out.println(c.staticStr);
        System.out.println(c.s);

        c.staticStr = "Static string setting execution";
        c.s = "Changing S as well"; // Should not work

//        Child c2 = new Child();
        Child c2 = Child.getChildInstance();
        System.out.println("c2 staticStr: " + c2.staticStr);
        System.out.println("c staticStr: " + c.staticStr);
        System.out.println("c2 s: " + c2.s);
        System.out.println("c s: " + c.s);

//        Child c3 = new Child(); // Wrong if constructor is private
        Child c3 = Child.getChildInstance();
        System.out.println("c3 staticStr: " + c3.staticStr);
        System.out.println("c staticStr: " + c.staticStr);
        System.out.println("c3 s: " + c3.s);
        System.out.println("c s: " + c.s);

        System.out.println(c.hashCode()==c2.hashCode());

        System.out.println("===========================");

        c.getString();
        c.speak();
        c.childhood();
        Child.parenthood();

        Dad d = new Dad();
        d.speak();
        Dad.parenthood();

        Dad d2 = Child.getChildInstance();
        ((Child) d2).kickBall();
        ((Child) d2).parenthood();
        ((Child) d2).childhood();
        d2.speak();
        d2.getA();
        System.out.println(d2.a);
    }

}
