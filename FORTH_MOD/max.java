import java.util.Scanner;
class max
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int ar[]=new int[10];
int i,max=Integer.MIN_VALUE;
for(i=0;i<10;i++){
ar[i]=sc.nextInt();
if(ar[i]>max)
max=ar[i];
}
System.out.println(max);
}
}