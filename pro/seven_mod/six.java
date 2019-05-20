import java.util.*;
class six
{
public static void main(String args[]){
int x,c,f,k,po=0,ge,re,gf,rf,cap=0,count=0;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
c=sc.nextInt();
f=sc.nextInt();
k=sc.nextInt();
if(k%2==0)
po=1;

ge=x-f;
re=2*ge;
gf=f;
rf=2*f;
cap=c;
while(k!=1){
c=c-f;
if(c>=re){
k--;}
else{
c=cap;
count++;
k--;}
c=c-re;
if(c>=rf){
k--;
}
else{
c=cap;
count++;
k--;}}


System.out.println(count);

/*if(po==1){
if(c>=ge){
System.out.println(count);
}else
System.out.println(count+1);}
else
{if(c>=gf){
System.out.println(count);
}else
System.out.println(count+1);}
*/
}}