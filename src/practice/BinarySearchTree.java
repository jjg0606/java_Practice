package practice;

public class BinarySearchTree {
	private TreeNode head;
	private int length;
	
	public int GetLength()
	{
		return length;
	}
	
	public void Insert(int[] _arr)
	{
		int length = _arr.length;
		for(int i =0;i<length;i++)
		{
			Insert(_arr[i]);
		}
	}
	
	public void Insert(int _value)
	{
		TreeNode node = new TreeNode(_value);
		if(head==null)
		{
			head = node;
		}
		else
		{
			head.Push(node);
		}
		length++;
	}
	
	public int[] PreorderTravelsal()
	{
		if(head==null)
			return null;
		
		int[] arr = new int[length];
		
		int index=0;
		TreeNode node = head;
		TreeNode right;
		TreeNode left;
		while(index<length)
		{			
			if(!node.GetTraveld())
			{
				arr[index] = node.value;
				node.SetTraveld(true);
				index++;
			}
			left = node.GetLeftOrNull();
			
			if(left!=null&&!left.GetTraveld())
			{
				node = left;
				continue;
			}
			
			right = node.GetRightOrNull();
			if(right!=null&&!right.GetTraveld())
			{
				node = right;
				continue;
			}
			
			node=node.GetParentOrNull();
		}
		return arr;
	}
	
	public int[] InorderTravelsal()
	{
		if(head==null)
			return null;
		int[] arr = new int[length];
		
		int index=0;
		TreeNode node = head;
		TreeNode right;
		TreeNode left;
		while(index<length)
		{
			left = node.GetLeftOrNull();
			
			if(left!=null&&!left.GetTraveld())
			{
				node = left;
				continue;
			}
			
			if(!node.GetTraveld())
			{
				arr[index] = node.value;
				node.SetTraveld(true);
				index++;
			}
			
			right = node.GetRightOrNull();
			if(right!=null&&!right.GetTraveld())
			{
				node = right;
				continue;
			}
			
			node=node.GetParentOrNull();
		}		
		return arr;
	}
	
	public int[] PostorderTravelsal()
	{
		if(head==null)
			return null;
		int[] arr = new int[length];
		
		int index=0;
		TreeNode node = head;
		TreeNode right;
		TreeNode left;
		while(index<length)
		{
			left = node.GetLeftOrNull();
			
			if(left!=null&&!left.GetTraveld())
			{
				node = left;
				continue;
			}
			
			right = node.GetRightOrNull();
			if(right!=null&&!right.GetTraveld())
			{
				node = right;
				continue;
			}
			
			if(!node.GetTraveld())
			{
				arr[index] = node.value;
				node.SetTraveld(true);
				index++;
			}		
			node=node.GetParentOrNull();
		}		
		return arr;
	}
	
	public BinarySearchTree()
	{
		length=0;
	}
}
