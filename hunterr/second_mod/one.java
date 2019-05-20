import java.util.*;
class one
{
public static void main(String args[]){
	int i,l=0,r;
	String n,s="";
	Scanner sc=new Scanner(System.in);
	n=sc.nextLine();
	int l1=n.length();
	for(i=0;i<l1;i++){
	if(n.charAt(i)!=' '){
	s=s+n.charAt(i);}
	else{
		char c[]=s.toCharArray();
		r=c.length-1;
		for(l=0;r>l;r--,l++){
		char c1=c[l];
		c[l]=c[r];
		c[r]=c1;}
	for(char j: c){
	System.out.print(j);}
	System.out.print(" ");
	l=0;s="";}}
	char c[]=s.toCharArray();
		r=c.length-1;
		for(l=0;r>l;r--,l++){
		char c1=c[l];
		c[l]=c[r];
		c[r]=c1;}
	for(char j: c){
	System.out.print(j);}
}}