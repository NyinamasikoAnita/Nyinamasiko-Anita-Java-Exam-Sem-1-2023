

//question 1
//(ii) a program in java to input 5 numbers from the keyboard and find their average.
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");
        int number1 = input.nextInt();

        System.out.println("enter number:");
        int number2 = input.nextInt();

        System.out.println("enter number:");
        int number3 = input.nextInt();

        System.out.println("enter number:");
        int number4= input.nextInt();

        System.out.println("enter number:");
        int number5 = input.nextInt();

        int average = (number1+number2+number3+number4+number5)/2;
        System.out.println("average of the numbers is :" + average);

    }


}
