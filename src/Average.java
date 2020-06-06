import java.util.Scanner;

public class Average
{
     public static void main(String[] args)

     {   // check average number of five number;

         Scanner scanner = new Scanner(System.in);
         System.out.println("please enter first number:");
         int num1 = scanner.nextInt();
         System.out.println("please enter second number");
         int num2 = scanner.nextInt();
         System.out.println("please enter third number");
         int num3 = scanner.nextInt();
         System.out.println("please enter fourth number");
         int num4 = scanner.nextInt();
         System.out.println("please enter fifth number");
         int num5 = scanner.nextInt();

         int average = (num1+num2+num3+num4+num5)/5;        // divide all numbers total by 5
         System.out.println("Average of five number is  "+average);














     }




















}

















