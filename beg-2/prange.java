import java.util.Scanner;

class prange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,i,j,x;
a=sc.nextInt();
b=sc.nextInt();
for(i=a+1;i<b;i++)
{
	x=0;
	for(j=1;j<=(i/2);j++)
	{
		if(i%j==0)
		{
			x++;
		}
			}
if(x==1)
		System.out.print(i+" ");

}
}
}

