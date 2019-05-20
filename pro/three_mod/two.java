import java.util.*;
class two{
public static void main(String args[]){
int n,i,incl,excl,temp; 
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar[]=new int[n];

for(i=0;i<n;i++)
ar[i]=sc.nextInt();

incl=ar[0];
excl=0;

for(i=1;i<n;i++){

temp=incl;
incl= Math.max((excl+ar[i]),incl);
excl=temp;}


System.out.println(Math.max(excl,incl));
}}