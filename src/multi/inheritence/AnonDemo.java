package multi.inheritence;

import java.lang.reflect.Method;

class Anon {
}

public class AnonDemo {
    public static void main(String[] args) throws Exception {

        new Anon() {
            private void hello() {
                System.out.println("Woah!!! ");
            }
        }.hello();

        Anon anonInner = new Anon() {

            @Override
            public String toString() {
                return "Overriden";
            }

            @SuppressWarnings("unused")
            private void hello() {
                System.out.println("Hello");
            }
        };
        System.out.println(anonInner.toString());
        // anonInner.hello(); // Won't compile!

        Method meth = anonInner.getClass().getDeclaredMethod("hello");
        meth.setAccessible(true);
        meth.invoke(anonInner);
        // anonInner.getClass().getMethod("hello").invoke(anonInner); // Won't compile!

        // @formatter:off
        var anonInner2 = new Anon() {
            private void hello() {
                System.out.println("New method here, and you can easily access me in Java 10+!\n" +
                        "The class is:  " + this.getClass());
            }
        };

        anonInner2.hello(); // Works!!
        // @formatter:on
    }
}
