import java.util.*;
class three
{
public static void main(String args[]){
	String s,s1=""; 
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	Stack<Character> stack=new Stack<Character>();
	for(int i=0;i<s.length();i++){
	stack.push(s.charAt(i));}
	while(!stack.isEmpty()){
	s1=s1+stack.pop();}
	if(s1.equals(s))
	System.out.print("YES");
	else
	System.out.print("NO");}}