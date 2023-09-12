import java.util.Scanner;

public class Max3Ladder {

    public static void main(String[]args) {
        Short a;
        Short b;
        Short c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number A :");
        a = input.nextShort();
        System.out.print("Enter the number B :");
        b = input.nextShort();
        System.out.print("Enter the number C :");
        c = input.nextShort();

        if(a>b && a>c)
        {
            System.out.println("a is maximum");
        }
        else if(b>c && b>a)
        {
            System.out.println("b is maximum");
        }
        else
        {
            System.out.println("c is maximum");
        }
    }
}
