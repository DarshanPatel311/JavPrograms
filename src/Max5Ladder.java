import java.util.Scanner;

public class Max5Ladder
{
    public static void main(String[]args) {
        Short a;
        Short b;
        Short c;
        Short d;
        Short e;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A :");
        a = input.nextShort();
        System.out.print("Enter the number B :");
        b = input.nextShort();
        System.out.print("Enter the number C :");
        c = input.nextShort();
        System.out.print("Enter the number D :");
        d = input.nextShort();
        System.out.print("Enter the number E :");
        e = input.nextShort();

        if(a>b && a>c && a>d && a>e)
        {
            System.out.println("a is maximum");
        }
        else if(b>c && b>a && b>d && b>e)
        {
            System.out.println("b is maximum");
        }
        else if(c>a && c>b && c>d && c>e)
        {
            System.out.println("c is maximum");
        }
        else if(d>a && d>b && d>c && d>e)
        {
            System.out.println("d is maximum");
        }
        else
        {
            System.out.println("e is maximum");
        }
    }
}
