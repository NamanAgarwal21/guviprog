import java.util.*;
class nine
{
public static void main(String args[]){
	int n,i,j;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int ar[]=new int[n];
	for(i=0;i<n;i++){
		ar[i]=sc.nextInt();}
	for(i=0;i<n-1;i++){
		for(j=i+1;j<n;j++){
			if(ar[i]+ar[j]==0)
				{System.out.println(ar[i]+" "+ar[j]);
				break;}}}
}}