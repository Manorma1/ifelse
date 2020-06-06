import java.util.Scanner;

public class leapyear
{
    public static void main (String[] args)

            // to check year is leap year or not ;
    {
        Scanner scanner = new Scanner( System.in);         // use scanner
        System. out.println("please enter a year");
        int year = scanner.nextInt();

        if(((year%4==0)&&(year%100!=0))||(year %400==0)){
            System.out.println(year +"  year is a leap year");     // if %4 = 0 than year is leap year

        }
        else{
            System.out.println( year + " year is not a leap year");

        }



















    }


















}
