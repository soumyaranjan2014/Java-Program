import java.util.Scanner;
public class ArrayRemoveElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arrya");
		int size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the remove location");
		int loc=sc.nextInt();
		for(int i=loc;i<size-1;i++)
		{
			arr[i]=arr[i+1];	
		}
		size--;
		
		for(int i=0;i<arr.length-1;i++)
		{

			System.out.println(arr[i]);
		}
	}

}
