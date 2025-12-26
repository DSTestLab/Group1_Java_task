package Emre;

public class Task4 {


    public static void main(String[] args) {

        reverse(-583);

    }

    public static void reverse(int number) {
        if (number < 0) {
            System.out.print("-");
            reverse(number * -1);
        } else if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            reverse(number / 10);
        }

    }



}
