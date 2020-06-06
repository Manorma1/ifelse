import java.util.Scanner;

public class City_Name
{
    public static void main(String[]args)
    {   // to check city name
        Scanner scanner= new Scanner(System.in);
        char ch;
        System.out.println("please enter any alphabet from a to f");
        ch = scanner.next().charAt(0); //  use character data type

        if(ch =='a')
        {

            System.out.println("city name is ahmadabad ");

        }
        else if(ch == 'b')
        {
            System.out.println("city name is birmingham");

        }
        else if(ch == 'c'){
            System.out.println("city name is cardiff");
        }
        else if(ch == 'd'){

            System.out.println("city name is delhi");

        }
        else if(ch == 'e'){
            System.out.println("city name is edmonton ");

        }
        else if(ch== 'f'){
            System.out.println("city name is far well");

        }
        else{
            System.out.println(" invalid entry");

        }












































    }

























}
