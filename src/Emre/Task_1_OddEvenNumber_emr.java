package Emre;

public class Task_1_OddEvenNumber_emr {
    public static void main(String[] args) {

        int[] numbers = {5,6};

        for ( int each : numbers ) {

            if (each % 2 == 0){

                System.out.println(each + " even number");

            } else {

                System.out.println(each + " odd number");
            }
        }

    }

}