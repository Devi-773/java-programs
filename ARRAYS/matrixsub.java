class matrixsub
{
	public static void main(String[] args)
	{
	int a[][]={{1,2,3},{4,5,6},{7,8,9}},i,j;
	int b[][]={{1,2,3},{4,5,6},{7,8,9}};
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		System.out.print(a[i][j]+" ");
		}
	System.out.println();
	}
	System.out.println();
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		System.out.print(b[i][j]+" ");
		}
	System.out.println();
	}
	System.out.println();
	System.out.println("difference of 2 matrix is");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		System.out.print(a[i][j]-b[i][j]+" ");
		}
	System.out.println();
	}
	}
}
	
	
	

	