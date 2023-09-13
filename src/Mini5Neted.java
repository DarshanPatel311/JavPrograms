import java.util.Scanner;

public class Mini5Neted
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

        if(a<b)
        {
            if(a<c)
            {
                if(a<d)
                {
                    if(a<e)
                    {
                        System.out.println("a is minimum");
                    }
                    else
                    {
                        System.out.println("e is minimum");
                    }
                }
                else
                {
                    if(d<e)
                    {
                        System.out.println("d is minimum");
                    }
                    else
                    {
                        System.out.println("e is minimum");
                    }
                }
            }
            else
            {
                if(c<d)
                {
                    if(c<e)
                    {
                        System.out.println("c is minimum");
                    }
                    else
                    {
                        System.out.println("e is minimum");
                    }
                }
                else
                {
                    if(d<e)
                    {
                        System.out.println("d is minimum");
                    }
                    else
                    {
                        System.out.println("e is minimum");
                    }
                }
            }
        }
        else
        {
            if(b<c)
            {
                if(b<d)
                {
                    if(b<e)
                    {
                        System.out.println("b is minimum");
                    }
                    else
                    {
                        System.out.println("e is minimum");
                    }
                }
                else
                {
                    if(d<e)
                    {
                        System.out.println("d is minimum");
                    }
                    else
                    {
                        System.out.println("e is minimum");
                    }
                }
            }
            else
            {
                if(c<d)
                {
                    if(c<e)
                    {
                        System.out.println("c is minimum");
                    }
                    else
                    {
                        System.out.println("e is minimum");
                    }
                }
                else
                {
                    if(d<e)
                    {
                        System.out.println("d is minimum");
                    }
                    else
                    {
                        System.out.println("e is minium");
                    }

                }
            }
        }
    }

}
