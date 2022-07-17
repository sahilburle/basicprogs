package basicprogs;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        System.out.println("Enter ur number");

        int no = num.nextInt();

        if (no == 0){
            System.out.println("number is zero");
        }
        else if (no % 2 == 0){
            System.out.println("num is even");
        }
        else
        {
            System.out.println("num is odd");
        }
    }
}
