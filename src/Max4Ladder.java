import java.util.Scanner;

public class Max4Ladder
{
    public static void main(String[]args) {
        Short a;
        Short b;
        Short c;
        Short d;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A :");
        a = input.nextShort();
        System.out.print("Enter the number B :");
        b = input.nextShort();
        System.out.print("Enter the number C :");
        c = input.nextShort();
        System.out.print("Enter the number D :");
        d = input.nextShort();


        if(a>b && a>c && a>d)
        {
            System.out.println("a is maximum");
        }
        else if(b>c && b>a && b>d)
        {
            System.out.println("b is maximum");
        }
        else if(c>a && c>b && c>d)
        {
            System.out.println("c is maximum");
        }
        else
        {
            System.out.println("d is maximum");
        }
    }

}
