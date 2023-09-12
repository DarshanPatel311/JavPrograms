import java.util.Scanner;

public class Max4number
{
    public static void main(String[]args)
    {
        Short a;
        Short b;
        Short c;
        Short d;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A :");
        a= input.nextShort();
        System.out.print("Enter the number B :");
        b = input.nextShort();
        System.out.print("Enter the number C :");
        c = input.nextShort();
        System.out.print("Enter the number D :");
        d = input.nextShort();

        if(a>b)
        {
            if(a>c)
            {
                if(a>d)
                {
                    System.out.println("a is maximum");
                }
                else
                {
                    System.out.println("d is maximum");
                }
            }
            else
            {
                if(c>d)
                {
                    System.out.println("c is maximum");
                }
                else
                {
                    System.out.println("d is maximum");
                }
            }
        }
        else
        {
            if(b>c)
            {
                if(b>d)
                {
                    System.out.println("b is maximum");
                }
                else
                {
                    System.out.println("d is maximum");
                }
            }
            else
            {
                if(c>d)
                {
                    System.out.println("c is maximum");
                }
                else
                {
                    System.out.println("d is maximum");
                }

            }
        }

    }


}
