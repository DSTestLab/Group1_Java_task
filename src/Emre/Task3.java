

//numbers- swap numbers
// two variables values without using a third variable
package Emre;

public class Task3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);


        a = a + b; // a is now 15
        b = a - b; // b is now 5
        a = a - b; // a is now 10

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
