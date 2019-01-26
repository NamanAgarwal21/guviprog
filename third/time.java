import java.util.Scanner;
class time{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int h,m;
m=sc.nextInt();
h=m/60;
m=m%60;

System.out.print(h+" "+m);
}}