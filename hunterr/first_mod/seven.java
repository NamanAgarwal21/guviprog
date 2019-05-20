import java.util.*;
class seven
{
public static void main(String args[]){
	int n,max,i;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	int ar[]=new int[n];
	for(i=0;i<n;i++){
		ar[i]=sc.nextInt();
		if(i%2==0 && ar[i]%2!=0){
			System.out.print(ar[i]+" ");}	
		else if(i%2!=0 && ar[i]%2==0)
			{System.out.print(ar[i]+" ");}
		}
}}