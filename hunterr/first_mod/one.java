import java.util.*;
class one
{
public static void main(String args[]){
int s,i,j=0;
Scanner sc=new Scanner(System.in);
s=sc.nextInt();
int n[]=new int[s];
for(i=0;i<s;i++){
n[i]=sc.nextInt();
}
Arrays.sort(n);
for(i=0;i<s-1;i++){
	if(n[i]==n[i+1]){
		
		j=i+2;
		int c=n[i];
		while(j<s-1 && n[j]==c){
			j=j+1;}
		System.out.print(n[i]+" ");
		i=j-1;}

}
if(j==0)
System.out.print("unique");
}}