import java.util.*;
class two
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
if(n[s-1]==0){
System.out.print("0");}
else{
for(i=s-1;i>=0;i--){
System.out.print(n[i]);}}
}}