import java.util.Scanner;

public class Vowel_Consonant
{
    public static void main(String[]args)
    {  // to check alphabet is vowel or consonant;
        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("please enter any alphabet" ); // use scanner
        ch = scanner.next().charAt(0);
        if (ch == 'A'||ch =='a' ||ch == 'E' || ch=='e'||ch == 'I' || ch=='i' || ch == 'O' ||ch=='o'||ch=='U'||ch=='u')
        { System.out.println(" this alphabet is vowel "); // print vowel;


        }
        else{
            System.out.println("this alphabet is  consonant"); // print consonant;
        }

















    }
















}
