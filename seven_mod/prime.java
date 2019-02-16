import java.util.Scanner;
class prime
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i,c=0;
n=sc.nextInt();
for(i=2;i<=(n/2);i++){
if(n%i==0){
c++;}
}
if(c==0)
System.out.print("yes");
else
System.out.print("no");
}}