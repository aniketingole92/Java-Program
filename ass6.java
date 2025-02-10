class ass6
{
	public static void main(String[] args)
	{
		int i,j;
		int arr1[][]={{1,2,3,4,5},{6,7,8,9,0}};
		System.out.println("The length of array is" + arr1.length);
		for(i=0;i<arr1.length;i++)
		{
			for(j=0;j<5;j++)
			{
				System.out.println(arr1[i][i]+"");
			}
			System.out.println();
		}
	}
}
