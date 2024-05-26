import java.util.Scanner;

public class ArrayShorting {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		int []a= {5,666,99,11,55};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);

		}
		
		
	}

}
