import java.util.Scanner;

public class Mini3Number {
    public static void main(String[]args)
    {
        Short a;
        Short b;
        Short c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A :");
        a= input.nextShort();
        System.out.print("Enter the number B :");
        b = input.nextShort();
        System.out.print("Enter the number C :");
        c = input.nextShort();

        if(a<b && a<c)
        {
            System.out.println("A is mini");
        }else if(b<a && a<c)
        {
            System.out.println("B is mini");
        } else if (c<a && c<b)
        {
            System.out.println("C is mini");
        }


    }
}

