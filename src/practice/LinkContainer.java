package practice;

public class LinkContainer {
	private LinkedArray first;
	private LinkedArray last;
	private int length;
	
	public LinkContainer()
	{
		first = null;
		last = null;
		length=0;
	}
	
	public void PushLast(int value)
	{
		LinkedArray slot = new LinkedArray(value);
		
		if(length==0)
		{
			first = slot;
			last = slot;
			length ++;
			return;
		}
		
		last.next = slot;
		last = last.next;
		length++;
	}
	
	public void PushFirst(int value)
	{
		LinkedArray slot = new LinkedArray(value);
		LinkedArray parr = first;
		first = slot;
		first.next = parr;
		length++;		
	}
	
	public void Print()
	{
		if(first ==null)
		{
			System.out.println("Nothing to Print");
			return;
		}
		
		LinkedArray prArr = first;
		for(int i =0;i<length;i++)
		{
			System.out.print(prArr.value+" ");
			prArr=prArr.next;
		}
		System.out.println();
			
	}
	
	public int Size()
	{
		return length;
	}
	
	public int At(int index)
	{
		if(length<=index)
		{
			return 0;
		}
				
		return Get(index).value;
	}
	
	public int PopFirst()
	{
		int rei=0;
		if(first==null)
			return rei;
			
		rei = first.value;
		first = first.next;
		length--;
		return rei;
	}
	
	private LinkedArray Get(int index)
	{
		if(length<=index)
		{
			return null;
		}
		LinkedArray reArr=first;
		for(int i=0;i<index;i++)
		{
			reArr=reArr.next;
		}	
		
		return reArr;
	}

}
