import java.util.Scanner;
class arr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int k,a,i,sum=0;
a=sc.nextInt();
k=sc.nextInt();
int n[]=new int[a];
for(i=0;i<a;i++)
{
n[i]=sc.nextInt();
}
for(i=0;i<k;i++)
{
sum=sum+n[i];}
System.out.println(sum);

}
}

