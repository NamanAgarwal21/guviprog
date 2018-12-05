import java.util.Scanner;
class dig
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int k=0,a;
a=sc.nextInt();
while(a!=0)
{
a=a/10;
k++;
}
System.out.println(k);

}
}

