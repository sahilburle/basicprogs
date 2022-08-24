package basicprogs;

import java.util.Scanner;

public class SumOf1stN_NaturalNo {

    public static void main(String[] args) {

        Scanner zzz = new Scanner(System.in);

        System.out.println("Please enter the number to find sum : ");
        int num = zzz.nextInt();

        int sum = 0;

        for(int i=1; i <= num; i++){
            sum = i + sum;
        }

        System.out.println("Sum of numbers is " + sum);
    }
}
