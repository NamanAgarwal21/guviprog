import java.util.Scanner;
class leng
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	String s;
	char ch;
	int l,i,c=0;
	s=sc.nextLine();
	l=s.length();
	for(i=0;i<l;i++) {
		ch=s.charAt(i);
		if(ch!=' ')
			c++;
	}
	System.out.println(c);
}
}
