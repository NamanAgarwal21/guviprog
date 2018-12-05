import java.util.Scanner;

class pall
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,x,y=0,z;
a=sc.nextInt();
z=a;
while(a!=0)
{
x=a%10;
a=a/10;
y=y*10+x;
}
if(y==z)
System.out.println("yes");
else
System.out.prinln("no");

}
}

