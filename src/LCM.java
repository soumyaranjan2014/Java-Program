
public class LCM {

	public static void main(String[] args) {
		int n1=24;
		int n2=12;
		int gcd=1;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0&&n2%i==0)
			{
				gcd=i;
			}
		}
		int lcm=n1*n2/gcd;
		System.out.println(lcm);

	}

}
