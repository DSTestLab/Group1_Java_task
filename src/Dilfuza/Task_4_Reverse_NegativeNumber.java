package Dilfuza;

/* Numbers -- Reverse negative number
    Write a return method that can reverse
    negative number and return it as int */

public class Task_4_Reverse_NegativeNumber {
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
