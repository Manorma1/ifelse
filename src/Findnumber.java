import java.util.Scanner;

public class Findnumber {
    public static void main(String[]args)
    {    // to check number is positive negative or zero;

        int num = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number (n)");
        int n= scanner.nextInt();


        if(n>0){
            System.out.println(n + " is positive");


        }
        else if  (n<0){
            System.out.println(n+" is negative.");
        }
        else {
            System.out.println("the number is zero");


        }






















    }




















}
