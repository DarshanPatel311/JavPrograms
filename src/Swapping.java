
import java.util.Scanner;
public class Swapping {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        int  one;
        int  two;

        System.out.print("Enter the number 1 :");
         one = input.nextByte();
        System.out.print("Enter the number 2 :");
         two = input.nextByte();

        one = (int) (one*two);
        two = (int) (one/two);
        one = (int) (one/two);

        System.out.println(one);
        System.out.println(two);



    }
}
