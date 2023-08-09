package practice;


public class Bubble_sort 
{
	public static void main(String[] args) {
		//sort an array using bubble sort in ascending
		int[] f= {5,3,4,1,2};
	for(int i=0; i<f.length; i++)
	{
		for(int j=i+1; j<f.length; j++)
		{
				if(f[i]>f[j])
				{
					int temp=f[i];
					f[i]=f[j];
					f[j]=temp;
					
				}
		}
		
	}
//	System.out.println(Arrays.toString(f)); without using for loop to print
	
	for (int k = 0; k < f.length; k++) 
	{
		System.out.print(f[k]+" ");
		
	}
	System.out.println("-------Ascending-----------");
	
	
	//--------------------------------------------------------------
	//sort an array using bubble sort in descending
			int[] f1= {5,3,4,1,2};
		for(int i=0; i<f1.length; i++)
		{
			for(int j=i+1; j<f1.length; j++)
			{
					if(f1[i]<f1[j])
					{
						int temp=f1[i];
						f1[i]=f1[j];
						f1[j]=temp;
						
					}
			}
			
		}
		for (int k = 0; k < f1.length; k++) 
		{
			System.out.print(f1[k]+" ");
			
		}
		System.out.println("--------Descending----------");
	}

}
