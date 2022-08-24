package basicprogs;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

    public static void main(String[] args) {

        Scanner zzz = new Scanner(System.in);

        System.out.println("Enter first number : ");
        int first = zzz.nextInt();

        System.out.println("Enter second number : ");
        int second = zzz.nextInt();

        if(first > second){
            System.out.println(first + " number is greater");
        }
        else if (first == second) {
            System.out.println("Number is equal");
        }
        else{
            System.out.println(second + " number is greater");
        }
    }
}
