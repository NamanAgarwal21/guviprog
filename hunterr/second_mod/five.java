import java.util.*;
class five{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n,i,max=Integer.MIN_VALUE,min=Integer.MIN_VALUE;
	n=sc.nextInt();
	int ar[]=new int[n];
	ArrayList<Integer> arr=new ArrayList<Integer>();
	for(i=0;i<n;i++){
		ar[i]=sc.nextInt();
		if(ar[i]>max){
			max=ar[i];}}
	for(i=n-1;i>=0;i--){
		if(ar[i]>min){
			arr.add(ar[i]);
			min=ar[i];}}
	Collections.sort(arr);
	for(Integer j:arr){
System.out.print(j+" ");}
	System.out.println();
	System.out.print(max);

}}