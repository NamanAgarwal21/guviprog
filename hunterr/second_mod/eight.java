import java.util.*;
class eight{ 
public static void main(String args[]){
int n,k,i,l,diff,pos,min;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int ar[][]=new int[n][n];
for(i=0;i<n;i++){
for(j=0;j<n;j++){
ar[i][j]=sc.nextInt();}}

for(i=0;i<n;i++){
for(j=0;j<n;j++){

min=Collections.min(arr);
pos=arr.indexOf(min);
System.out.print(ar.get(pos)+" ");
ar.remove(pos);
arr.remove(pos);}
}}