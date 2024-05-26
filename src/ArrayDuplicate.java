import java.util.HashSet;
import java.util.Scanner;
public class ArrayDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int []a= {55,66,99,99,99,55,55,55,66,66};
		HashSet<Integer>hs=new HashSet<Integer>();
		for(int j=0;j<a.length;j++)
		{
			for(int k=j+1;k<a.length;k++)
			{
				if(a[j]==a[k])
				{
					hs.add(a[j]);
					
				}
			}
		}
		System.out.println(hs);
		
	}

}
