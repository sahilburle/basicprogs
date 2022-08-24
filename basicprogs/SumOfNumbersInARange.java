package basicprogs;

import java.util.Scanner;

public class SumOfNumbersInARange {

    public static void main(String[] args) {

        Scanner zzz = new Scanner(System.in);

        System.out.println("Enter starting range to find sum : ");
        int start = zzz.nextInt();

        System.out.println("Enter ending range to find sum : ");
        int end = zzz.nextInt();

        int sum = 0;

        for (int i = start; i <= end; i++){
            sum = sum + i;
        }

        System.out.println("Sum of numbers is : " + sum);

    }
}
