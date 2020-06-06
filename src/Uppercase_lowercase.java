import java.util.Scanner;

public class Uppercase_lowercase {

    public static void main(String []args)
    {    // to check uppercase to lowercase;

        Scanner scanner = new Scanner(System.in);  // use scanner;
        char ch;
        int temp;
        System.out.println("please enter  character in uppercase");
        ch  =scanner.next(). charAt(0);    // char formula;
        temp =(int)ch;
        temp =temp+32;   // A - 65  and a --with 97;
        ch= (char)temp;
        System.out.println("Lower case is : "+ch);

















    }


}
