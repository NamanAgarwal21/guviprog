import java.util.*;
class two
{
public static void main(String args[]){
	int n,m,i,l;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	m=sc.nextInt();
	ArrayList<Integer> ar=new ArrayList<Integer>(n);
	for(i=0;i<n;i++){
	int k=sc.nextInt();
	ar.add(k);}
	Collections.sort(ar);
	l=ar.get(n-m);
	System.out.print(l);}}