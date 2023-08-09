package practice;

public class Min_Max_Number 
{
	public static void main(String[] args) 
	{
		
		//1st min number
		int[] a= {5,3,4,1,2};
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
					if(a[i]>a[j])
					{
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						
					}
			}
//			System.out.print(a[i]+" ");
		}
		System.out.println("min number is ====>"+a[0]);
		
		
		
		//1st max number
				int[] a1= {5,3,4,1,2};
				for(int i=0; i<a1.length; i++)
				{
					for(int j=i+1; j<a1.length; j++)
					{
							if(a1[i]<a1[j])
							{
								int temp=a1[i];
								a1[i]=a1[j];
								a1[j]=temp;
								
							}
					}
//					System.out.print(a[i]+" ");
				}
				System.out.println("max number is ====>"+a1[0]);
	}

}
