import java.util.Scanner;
class min
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,min=Integer.MAX_VALUE;
int ar[]=new int[10];
for(i=0;i<=9;i++){
ar[i]=sc.nextInt();
if(ar[i]<min)
min=ar[i];}
System.out.print(min);
}}