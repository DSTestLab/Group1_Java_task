package Dilfuza;

public class Task_2_FINRA {
    public static void main(String[] args) {

        int num = 1;
        int n = 50;

        do {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("FINRA ");
            } else if (num % 3 == 0) {
                System.out.print("FIN ");
            } else if (num % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(num + " ");
            }
            num++;

        }  while (num <= n) ;

    }
}
