import java.util.Scanner;

public class Input
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        String Name;
        byte Age;
        long Number;
        String Add;
        float Pr;
        String Study;

        System.out.print("Enter your name:");
        Name =input.nextLine();
        System.out.print("Enter your Age:");
        Age = input.nextByte();
        System.out.println("Enter your Number:");
        Number = input.nextLong();

        System.out.print("Enter your PR%:");
        Pr = input.nextFloat();

        System.out.print("Enter your  Raning Study:");
        Study = input.nextLine();
        System.out.println("Enter your Add:");
        Add = input.next();

        System.out.println("Name is : "+Name   );
        System.out.println("Age is : "+Age   );
        System.out.println("Number is : "+Number  );
        System.out.println(" PR% is : "+Pr );
        System.out.println("Raning Study is : "+Study   );
        System.out.println("Add is : "+Add   );
    }




}
