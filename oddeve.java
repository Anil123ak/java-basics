import java.util.Scanner;
public class oddeve
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n*8);
        }
        else
        {
            System.out.println(n*9);
        }
    }
}
