import java.util.*;
class three
{
public static void main(String args[]){
int s,i,c=0;
Scanner sc=new Scanner(System.in);
s=sc.nextInt();
int n[]=new int[s];
for(i=0;i<s;i++){
n[i]=sc.nextInt();
}
for(i=0;i<s;i++){
if(n[i]==i){ 
c=1;
System.out.print(i+" ");}}
if(c==0){
System.out.print("-1");}
}}