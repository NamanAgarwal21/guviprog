import java.util.Scanner;
class range
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a,b,c,x=0;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
for(int i=b+1;i<c;i++){
if(i==a){
x=1;
break;}}
if(x==1)
System.out.print("yes");
else
System.out.print("no");
}}


