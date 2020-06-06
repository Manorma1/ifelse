import java.util.Scanner;

public class Gross_Salary
{
    public static void main(String[] args)
    {     // to check gross salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter employee id");
        String id = scanner.nextLine();
        System.out.println("please enter name");
        String name = scanner.nextLine();
        System.out.println(" please enter  basic salary");
        int basic_salary = scanner.nextInt();
        float hra = (basic_salary*10)/100;   // 10% of basic salary
        float da =  (basic_salary*8)/100;      // 8% of basic salary
        float ta = (basic_salary*9)/100;        // 9% of  basic salary
        float pf = (basic_salary*20)/100;      // 20% of basic salary
        float gross_salary = basic_salary+hra+ta+da-pf;
System.out.println("The gross salary is"+gross_salary);





















    }



















}
