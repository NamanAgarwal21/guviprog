import java.util.Scanner;
class quick{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n,i;
n=sc.nextInt();
int ar[]=new int[n];
for(i=0;i<n;i++)
{
ar[i]=sc.nextInt();
}
quick ob= new quick();
ob.sort(ar,0,n-1);

printArray(ar);
}
  
  static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
   
 void sort(int ar[],int start,int end){
if(start<end){
int q=partition(ar,start,end);
sort(ar,start,q-1);
sort(ar,q+1,end);
}}
int partition(int ar[],int st,int end){
int p=ar[end];
int i=st-1;
for(int j=st;j<end;j++){
if(ar[j]<=p)
{
i++;
int temp=ar[i];
ar[i]=ar[j];
ar[j]=ar[j];
}}
int temp=ar[i+1];
ar[i+1]=ar[end];
ar[end]=temp;
return (i+1);}}
