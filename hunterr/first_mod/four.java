import java.util.*;
class four
{
public static void main(String args[]){
int s,i,c=0;
Scanner sc=new Scanner(System.in);
s=sc.nextInt();
int n[]=new int[s];
for(i=0;i<s;i++){
n[i]=sc.nextInt();
}
Arrays.sort(n);
for(i=0;i<s-1;i+=2){
if(n[i]!=n[i+1]){ 
System.out.print(n[i]);
c=1;
break;}}
if(c==0)
System.out.print(n[s-1]);
}}