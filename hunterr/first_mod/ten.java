import java.util.*;
class ten
{
public static void main(String args[]){
	int n,i,j,m,c=0;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=sc.nextInt();
	int ar[]=new int[n];
	int ar1[]=new int[m];
	for(i=0;i<n;i++){
		ar[i]=sc.nextInt();}
	for(i=0;i<m;i++){
		ar1[i]=sc.nextInt();}
	HashSet<Integer> hset=new HashSet<>();
	for(i=0;i<n;i++){
		if(!hset.contains(ar[i]))
			hset.add(ar[i]);}
	for(i=0;i<m;i++){
		if(!hset.contains(ar1[i])){
			c=1;break;}}
if(c==1)
System.out.print("NO");
else
System.out.print("YES");
}}