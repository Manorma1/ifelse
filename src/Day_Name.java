import java.util.Scanner;

public class Day_Name
{
    public static void main(String[]args)

    { // to check day name
        Scanner scanner = new Scanner(System.in); // use scanner
        int num = 0;   // use int data type

        System.out.println("please enter week number");
        num  = scanner.nextInt();
        if(num==1){
            System.out.println("monday is first day of the week");
        }

            else  if(num==2){
                System.out.println(" tuesday is second day of week");

            }
            else if(num==3){
                System.out.println("wednesday is third day of the week  ");
        }
            else if( num==4){

                System.out.println("thursday is fourth day of the week");

        }
            else if(num==5){
                System.out.println("friday is fifth day of the week");
        }
            else if(num==6){
                System.out.println("saturday is sixth day of the week");

        }
            else if(num==7){
                System.out.println("sunday is seventh day of the week");
        }





















    }

















}
