package practice;

public class SortableArray {
	private int[] arr;
	private int length;
	

	private void Switch(int index1,int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}	
	
	private void CopyArr(int[] target)
	{
		for(int i=0;i<length;i++)
		{
			arr[i] = target[i];
		}
	}

	public SortableArray(int[] _arr)
	{
		arr = _arr;
		length = arr.length;
	}
	
	public void Print()
	{
		if (length == 0)
		{
			System.out.println("Nothing to Print");
			return;
		}
		
		for(int i =0;i<length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public void HeapSorting()
	{
		for(int i=1;i<length;i++)
		{
			int currIndex = i;
			int parentIndex = (i-1)/2;
			while(arr[currIndex]>arr[parentIndex])
			{
				Switch(currIndex, parentIndex);
				currIndex = parentIndex;
				parentIndex = (parentIndex-1)/2;
			}
		}
	}
	
	public void MergeSort()
	{
		if (length==0)
		{
			System.out.println("nothing to sort");
			return;
		}
		int[][] target = new int[2][length];
		
		int targetnum=0;
		int size=2;
		for(int i=0;i<length;i++) // 최초복사
		{
			target[1][i] = arr[i];
		}
		
		while(size<length)
		{
			for(int i=0;i<length;i+=size)
			{
				Merge(i,size,target[targetnum],target[targetnum^1]);
			}
			size=size*2;
			targetnum=targetnum^1;
		}
		Merge(0,size,target[targetnum],target[targetnum^1]);
		CopyArr(target[targetnum]);
	}
	
	private void Merge(int start, int size,int[] targetarr,int[] sourcearr)
	{
		int end = (size+start-1)>=length ? length-1 : size+start-1;
		int pivot = (start+size/2)>end?end:(start+size/2);
		int lp = start;
		int rp = pivot;
		int tp = start; 
		
		while(tp<=end)
		{
			if(lp<pivot&&(rp>end||sourcearr[lp]>sourcearr[rp]))
			{
				targetarr[tp]=sourcearr[lp];
				tp++;
				lp++;
			}
			else
			{
				targetarr[tp]=sourcearr[rp];
				tp++;
				rp++;
			}
		}

		
	}
	
	public void QuickSort()
	{
		
	}
	
	private void Quick(int start,int end)
	{
		
	}

}
