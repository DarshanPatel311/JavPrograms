import java.util.Scanner;

public class Max2Number {

    public static void main(String[]args)
    {
       Short a;
       Short b;
        Scanner input = new Scanner(System.in);

          System.out.print("Enter the number A :");
           a= input.nextShort();
        System.out.print("Enter the number B :");
        b = input.nextShort();
        if(a>b)
        {
            System.out.println("A is max");

        }else {
            System.out.println("B is max");
        }

    }
}
