import java.util.Scanner;
class Palindron
{
    public static void main (String[]arg)
    {
        int n,c,r,s=0;
        System.out.println("enter the no");
        Scanner obj= new Scanner(System.in);
        n=obj.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            s=(s*10)+r;
            n=n/10;
        }
        if(c==s)
        {
        System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrom");
        }
    }
}