
public class ArrayMaximumAndMinimum {

	public static void main(String[] args) {
		
	int []arr= {44,55,66,33,22,99};
	int max=arr[0];
	
	for(int i=1;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
	}
	System.out.println(max);
	
	}

}
