import java.util.Scanner;

public class Even_odd
{
    public static void main(String [] args)
    {

        Scanner scanner =new Scanner(System.in); // use scanner
        System.out.println(" please enter a   number number");
        int  Number= scanner. nextInt();



         //   find out number is odd or even;

         String  myNumber  = (Number   % 2 ==0)  ?"even" : "odd";  // use ternary operator
        System.out.println(Number + " is " + myNumber);








































    }
































}
