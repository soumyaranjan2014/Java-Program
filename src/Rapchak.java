import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class Rapchak {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the remove location ");
		int remove=sc.nextInt();
		
		for(int i=remove;i<size-1;i++)
		{
			arr[i]=arr[i+1];
		}
		size--;
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
		
}


