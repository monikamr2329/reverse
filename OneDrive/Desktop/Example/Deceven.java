class Deceven 
{
	static void Dec(int no)
	{
		int sum=1;
		for(int i=20;i>=no;i--)
		{
			if (i%2==0)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("The Even number is "+sum);
	}
	public static void main(String[] args) 
	{
		Dec(0);
	}
}
