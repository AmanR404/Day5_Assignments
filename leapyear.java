// Program to check Leap year

import java.util.Scanner;
public class leapyear{
    public static void main(String[] args) {
        System.out.println("This is a leap year program");
        System.out.print("Enter year : ");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input % 4 == 0 || input % 400 == 0 && input % 100 != 0){
            System.out.println("This is a Leap year");
        }
        else{
            System.out.println("This is not a Leap year");

        }

        
    }
}