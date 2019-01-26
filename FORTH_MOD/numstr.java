import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class numstr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
	String s;
	int c=0;
	s=sc.nextLine();
	Pattern p=Pattern.compile("\\d");
	Matcher m=p.matcher(s);
	while(m.find()){
			c++;
	}
	System.out.println(c);
}
}