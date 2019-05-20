import java.util.*;
class six
{
public static void main(String args[]){
	int n,max,i;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	Integer ar[]=new Integer[n];
	for(i=0;i<n;i++){
		ar[i]=sc.nextInt();}
	max=Collections.max(Arrays.asList(ar));
	int a[]=new int[max];
	for(i=0;i<n;i++){
		if(a[ar[i]]==0){
			a[ar[i]]++;}	
		else{System.out.println(ar[i]);
			break;}
		}
}}