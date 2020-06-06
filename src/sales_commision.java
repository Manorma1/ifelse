import java.util.Scanner;

public class sales_commision
{
    public static void main(String [] args)

  {       // to check sales commission;
      Scanner scanner= new Scanner(System.in);    //use scanner
      System.out.println("please enter sales id"); // user enter id;
      int id = scanner.nextInt();

      System. out.println("please enter sellers name");
      String name =scanner.nextLine();


      System.out.println("please enter sales amount");
      int amount =scanner.nextInt();
      System.out.println("please enter basic_salary ");
      int salary = scanner. nextInt();

      if (amount<10000){

          System.out.println("sales commission is " +(amount*2)/100);   // commission is 2% of sales

      }
      else if(amount>=10000 && amount <20000){
          System.out.println("sales commission is "+(amount*5)/100);   // commission is 5% of sales

      }
      else if(amount >=200000 && amount< 30000){
          System.out.println("sales commission is "+(amount*10)/100);    //commission is10% of sales
      }
      else if(amount >=30000&& amount<50000){

          System.out.println("sales commission is "+(amount*20)/100);    //commission is 20% of sale

      }
      else if(amount >=50000){
          System.out.println(" sales commission is "+(amount*35)/100);    // commission is 35% of sale

  }

      }

  }











































