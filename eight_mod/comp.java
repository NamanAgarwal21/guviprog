import java.util.Scanner;
class comp{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int i,s,c=0;
s=sc.nextInt();
for(i=1;i<s;i++){
if(s%i==0)
{c++;}
if(c>1)
break;
}
if(c>1)
System.out.println("yes");
else
System.out.println("no");}}
