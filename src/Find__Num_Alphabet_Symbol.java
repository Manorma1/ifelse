import java.util.Scanner;

public class Find__Num_Alphabet_Symbol
{

    public static void main(String [] args)

    {    //to check character is alphabet, number or symbol;

        Scanner scanner = new Scanner(System.in);
        char ch;
        System.out.println("please enter any character ");
        ch= scanner.next().charAt(0);
        if ((ch >= 'a'&& ch<='z')||(ch>='A'&&ch<='Z'))
        {
            System.out.println(" this character is alphabet"+ch);

        }

        else if(ch>= '0'&& ch <= '9'){
            System.out.println(" this character is  number"+ch);


        }
        else{


            System.out.println("this character is symbol");

        }



















    }




















}




