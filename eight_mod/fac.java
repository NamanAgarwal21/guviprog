import java.util.Scanner;
class fac{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,s;
s=sc.nextInt();
for(i=1;i<=s;i++){
if(s%i==0)
{
System.out.print(i+" ");
}}}}