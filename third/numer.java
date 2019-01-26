import java.util.Scanner;
class numer{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String st;
st=sc.nextLine();
boolean check=true;
check= st.matches("-?\\d+(\\.\\d+)?");
if(check)
System.out.println("Yes");
else
System.out.println("No");
}}