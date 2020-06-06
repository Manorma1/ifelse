import java.util.Scanner;

public class student_MarksSheet
{
    public static void main (String [] args)
    {     // to check student pass or fail
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter student roll number");
        int number = scanner.nextInt();
        System.out.println("please enter maths marks:");
        int maths = scanner.nextInt();
        System.out.println("please enter science marks:");
        int sci = scanner.nextInt();
        System.out.println("please enter english marks: ");
        int eng = scanner.nextInt();
        int total = maths +sci + eng;
        float percentage = total/3;
        System.out.println("total marks  =" +total);
        System.out.println("percentage = " + percentage);
        if (percentage < 35)
        {
            System.out.println(" student is fail");          // use if else

        }
        else if(percentage >= 35 && percentage<50){
            System.out.println("student is pass with grade c");

        }
        else if(percentage >= 50 && percentage<60){
            System.out.println("student is pass with grade B");

        }
        else if (percentage >= 60 && percentage<80){
            System.out.println("student is pass with grade A");

        }
        else if (percentage>= 80){
            System.out.println("student is pass with grade A++");

        }
        else{
            System.out.println("student is fail");
        }





























    }
}
