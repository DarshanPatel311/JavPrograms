import java.util.Scanner;

public class IfElse
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        byte one;
        byte two;

        System.out.print("Enter the number A:");
        one = input.nextByte();
        System.out.print("Enter the number B:");
        two = input.nextByte();

        if(one<two)
        {
           System.out.println("A is mini");

        }else
        {
            System.out.println("B is mini");

        }

    }



}
