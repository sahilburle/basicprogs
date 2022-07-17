package basicprogs;

import java.util.Scanner;

class PositiveOrNegative{

    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);

        System.out.println("Enter ur number");

        int no = num.nextInt();

        if(no > 0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("Number is negative");
        }        
    }
}