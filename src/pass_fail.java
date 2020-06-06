import java.util.Scanner;

public class pass_fail
{

    public static void main(String[] args)

    { // student must be pass in all subject;

        Scanner scanner = new Scanner(System.in);  // use scanner
        System.out.println("please enter student name");
        String name = scanner.nextLine();
        System.out.println("please enter student roll number ");
        int number= scanner. nextInt();
        System.out.println("please enter maths marks");
        int maths = scanner.nextInt();
        System.out.println("please enter sci marks");
        int sci = scanner.nextInt();
        System.out.println("please enter eng marks");
        int eng = scanner.nextInt();
        int marks = 35; // marks must be 35 for pass

        if  (maths >=35 && sci >=35 && eng>=35)
   {
            System.out.println("student is pass");

        }
        else{
            System.out.println("student is fail");

        }














    }
}
