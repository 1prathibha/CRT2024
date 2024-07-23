import java.util.Scanner;
public class BinarySearch
{
public static int binarySearch(int[] a,int key)
{
int n=a.length;
int low=0;
int high=n-1;
while(low<=high)
{
int mid=(low+high)/2;
if(a[mid]==key)
return mid;
else if(a[mid]>key)
high=mid-1;
else
low=mid+1;
}
return -1;
}
public static void main(String[] args)
{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		System.out.println(binarySearch(a,key));
		}
}


