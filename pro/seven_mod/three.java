import java.util.*;
class three{
public static void main(String args[]){
String s;
int i,j=0,res=1;
Scanner sc=new Scanner(System.in);
s=sc.next();
HashSet<Character> hset=new HashSet<>();
for(i=0;i<s.length();i++){
char c=s.charAt(i);
if(!hset.contains(c)){
hset.add(c);
res=Math.max(res,hset.size());
}else{
while(j<i){
if(s.charAt(j)==c){

j++;
break;}
hset.remove(s.charAt(j));
j++;
}}}
System.out.println(res);}}
