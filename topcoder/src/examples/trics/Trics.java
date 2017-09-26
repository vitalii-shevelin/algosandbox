package examples.trics;

import java.util.Date;

/**
 * Created by vitalii.shevelin on 20.05.2016.
 */
public class Trics {

    public static void main(String[] args) {
        Trics t = new Trics();
        System.out.println("Result of foo(): " + t.foo());
        System.out.println("Result of bar(): " + t.bar());
        System.out.println("Result of prim(): " + t.prim());

    }

    private int prim() {
        int result  = 0;
        try {
            return result;
        } finally {
            result = 2;
        }
    }
    private Date foo() {
        Date result  = new Date();
        try {
            return result;
        } finally {
            result.setTime(3333333);
        }
    }
    private String bar() {
        String result  = "foo";
        try {
            return result;
        } finally {
            result = "bar";
        }
    }

}
