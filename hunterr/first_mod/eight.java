import java.util.*;
class eight
{
public static void main(String args[]){
	int n,i,j,k
;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int ar[]=new int[n];
	for(i=0;i<n;i++){
		ar[i]=sc.nextInt();}
	for(i=0;i<n-2;i++){
		for(j=i+1;j<n-1;j++){
			for(k=j+1;k<n;k++){
				if(ar[i]+ar[j]==ar[k]){
					System.out.println(ar[i]+" "+ar[j]+" "+ar[k]);}}}}
}}