import java.util.Scanner;
class timediff{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int h1,m1,h2,m2;
h1=sc.nextInt();
m1=sc.nextInt();
h2=sc.nextInt();
m2=sc.nextInt();
m1=h1*60+m1;
m2=h2*60+m2;
int m=Math.abs(m1-m2);
int h=m/60;
m=m%60;

System.out.print(h+" "+m);
}}