import java.util.Scanner;

public class Bio {

    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        String name;
        byte age;
        long phone;

        System.out.print("Enter your name : ");
        name = input.nextLine();
        System.out.print("Enter your age : ");
        age = input.nextByte();
        System.out.print("Enter your mobile number : ");
        phone = input.nextLong();

        System.out.println("Name : "+name+" Age : "+age+" phone : "+phone);









    }




}
