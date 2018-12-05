import java.util.Scanner;
class vow
{
public static void main(String args[])
{
char n;
Scanner sc=new Scanner(System.in);
n=sc.next().charAt(0);
if(n>=97 && n<=122 || n>=65 && n<=90)
{
	if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
	System.out.println("Vowel");
	else
	System.out.println("Consonant");
}
else
{
System.out.println("invalid");
}
}}

