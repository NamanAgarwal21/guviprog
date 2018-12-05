import java.util.Scanner;
class leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
a=sc.nextInt();
if(a%4==0)
{
if(a%100!=0 || a%400==0)
System.out.println("yes");
else 
System.out.println("no");
}

else
System.out.println("no");

}
}

