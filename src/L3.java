
public class L3 {

	public static void main(String[] args) {
		int n=9;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i>=j)&&(i+j>=n-1))
				{
					System.out.print((i-(n/2)+1)+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
