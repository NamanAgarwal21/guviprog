import java.util.Scanner;
class four{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s;
	s=sc.nextLine();
	four obj=new four();
	obj.perm(s,0,s.length()-1);}
	
	public void perm(String s,int l,int r){
	if(l==r)System.out.println(s);
	else{
		for(int i=l;i<=r;i++){
			s=swap(s,l,i);
			perm(s,l+1,r);
			s=swap(s,l,i);}}}


	public String swap(String s,int l,int r){
		char[]c=s.toCharArray();
		char temp=c[l];
		c[l]=c[r];
		c[r]=temp;
		return(String.valueOf(c));}}