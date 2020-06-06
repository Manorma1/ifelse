import java.util.Scanner;

public class Using_Symbol
{
    public static void main(String[]args)
    {      // add, sub.multi.div to use symbol;
        Scanner scanner = new Scanner(System.in);
        char ch;

        System.out.println(" please enter first number");
        int a= scanner.nextInt();
        System.out.println("please enter second number");
        int b = scanner.nextInt();
        System.out.println("please enter symbol");
        ch = scanner.next().charAt(0);
        int add = a+b;
        int sub = a-b;
        int multi = a*b;
        int div =a/b;

        if(ch=='+'){

         System.out.println(" addition of two number is" +add );  // addition of a&b

         }
        else if  (ch =='-'){
             System.out.println(" subtraction of two number   is" +sub); // subtraction of a & b
         }
         else if (ch== '*'){
             System.out.println("multiplication  of two number is" +multi);//  multiplication of a&b

         }
         else if (ch==div){
             System.out.println("division of two number  is" +div);  //division of a&b
         }












    }




















    }















