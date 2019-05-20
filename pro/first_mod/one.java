import java.util.*;
class one{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i;
String s;
n=sc.nextInt();
String ar[]=new String[n];
for(i=0;i<n;i++){
ar[i]=sc.next();}
s=ar[0];
for(i=1;i<n;i++){ 		
s=pref(s,ar[i]);}
System.out.print(s);}

static String pref(String x,String y){
String result="";
int i=x.length(),j=y.length();
for(int a=0,b=0;a<i && b<j;a++,b++){
if(x.charAt(a)!=y.charAt(b)){
break;}
else
result=result+x.charAt(a);}
return result;}
}