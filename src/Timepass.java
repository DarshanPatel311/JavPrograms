import java.util.Scanner;

public class Timepass
{
    public static void main(String[]args)
    {
        int Age;
        String Name;
        long Number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Name:");
        Name = input.nextLine();
        System.out.print("Enter the number :");
        Number = input.nextLong();
        System.out.print("Enter the Age :");
        Age =  input.nextInt();

          System.out.println("Name is : "+Name);
        System.out.println("Number is : "+Number);
        System.out.println("Age is  :"+Age);

    }




}
