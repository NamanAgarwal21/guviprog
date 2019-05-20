import java.util.*;
class six{ 
public static void main(String args[]){
int n,k,i,l,diff,pos,min;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
k=sc.nextInt();
ArrayList<Integer> ar=new ArrayList<Integer>();
ArrayList<Integer> arr=new ArrayList<Integer>();
for(i=0;i<n;i++){
l=sc.nextInt();
if(l!=k){
ar.add(l);
diff=l-k;
arr.add(Math.abs(diff));
}}

for(i=0;i<3;i++){
min=Collections.min(arr);
pos=arr.indexOf(min);
System.out.print(ar.get(pos)+" ");
ar.remove(pos);
arr.remove(pos);}
}}