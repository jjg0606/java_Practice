package practice;

public class CustomArray {
	int[] array;
	
	public void QuickSorting(int begin,int end)
	{
		int lp=begin;
		int rp=end;

		int pivot = (rp+lp)/2;
		while(lp<rp)
		{
			while(array[lp]<array[pivot]&&array[lp]<array[rp])
			{
				lp++;
			}
			while(array[rp]>=array[pivot]&&array[lp]<array[rp])
			{
				rp--;
			}
			if(lp<rp) 
			{
				if(lp==pivot)
				{
					pivot=rp;
				}
				int temp=array[lp];
				array[lp]=array[rp];
				array[rp]=temp;				
			}
		}				
	}
	
	public void MergeSort()
	{
		int length = array.length;
		
		if(length==0)
			return;
		
		int pair = 2;
		while(length>pair)
		{
			int next=0;
			while(next<length)
			{
				int end = next+pair-1;
				if(end >= length)
				{
					end = length-1;
				}
				if(!(next+pair/2 > end))
					MergeSort(next,end,next+pair/2);
				next+=pair;				
			}
			pair*=2;
		}
		MergeSort(0, length-1,pair/2);
		
	}

	private void MergeSort(int begin, int end, int pivot)
	{
		System.out.println(String.format("%d to %d pivot %d called", begin,end,pivot));
		int length = end-begin+1;
		if(length<=1)
		{
			if(array[begin]>array[end])
			{
				int temp=array[end];
				array[end]=array[begin];
				array[begin]=temp;
			}
			return;	
		}
	
		int[] tempArr =new int[length];
		int lp = begin;
		int middle = pivot;
		int rp = middle;
		for(int i=0;i<length;i++)
		{
			if(lp<=middle-1&&(rp>end||array[lp]<array[rp]))
			{
				tempArr[i]=array[lp];
				lp++;
			}
			else
			{
				tempArr[i]=array[rp];
				rp++;
			}
		}
		for(int i=0;i<length;i++)
		{
			array[i+begin] = tempArr[i];
		}
	}
	
	public static void QuickSoring(int[] arr,int begin,int end)
	{
		int lp=begin;
		int rp=end;
		int pivot = (lp+rp)/2;
		while(true)
		{
			while(arr[lp]<arr[pivot])
			{
				lp++;
			}
			while(arr[rp]>arr[pivot])
			{
				rp--;
			}
			if(arr[lp]>arr[rp])
			{
				int temp = arr[rp];
				arr[rp] = arr[lp];
				arr[lp] = temp;
			}
		}
	}
	
	public void print()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

	public CustomArray(int[] arr)
	{
		array=arr;
	}
	
	public static void main(String[] args) {
		int[] ina = {68,11,29,3,15,9,32,23,100,15,22,56,85,96};
		CustomArray ca =new CustomArray(ina) ;
		ca.print();
		ca.MergeSort();
		ca.print();


		
		
	}
}
