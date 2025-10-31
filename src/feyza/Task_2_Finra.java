package feyza;
/*
QUESTION 2- Write a function which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
 print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number.
 for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
*/

public class Task_2_Finra {
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN  ");
            } else if (i % 5 == 0) {
                System.out.print("RA  ");
            } else {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 30);
    }
}

