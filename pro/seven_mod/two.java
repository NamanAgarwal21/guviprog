import java.util.*;
class two{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s;
int i,k,l,c=0,max=0;
s=sc.next();
l=s.length();
for(i=0;i<l-1;i++){
	k=s.length();
	while(c==0 && i!=(k) && max<(k-i-1)){
		c=check(s,i,k-1);
		k--;
		}
	if(c>max) {max=c;}
	c=0;
}
System.out.print(l-max);}

static int check(String s,int f,int l){
int m= l-f;
int y=m;
while(m!=0){
if(s.charAt(f)==s.charAt(l)){
m--;
f++;
l--;
}else
return (0);}

return(y+1);}}