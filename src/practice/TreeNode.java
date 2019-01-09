package practice;

public class TreeNode {
	private TreeNode parent;
	private TreeNode left;  // smaller or same
	private TreeNode right; // bigger
	private boolean isTraveled; // using for travelsal
	public int value;
	
	public void Push(TreeNode node)
	{
		if(node.value > value)
		{
			if(right==null)
			{
				right = node;
				node.parent=this;
			}
			else
			{
				right.Push(node);
			}
		}
		else
		{
			if(left==null)
			{
				left=node;
				node.parent=this;
			}
			else
			{
				left.Push(node);
			}
		}
	}
	
	public TreeNode GetRightOrNull()
	{
		return right;
	}
	
	public TreeNode GetLeftOrNull()
	{
		return left;
	}
	
	public TreeNode GetParentOrNull()
	{
		return parent;
	}
	
	public void SetTraveld(boolean bool)
	{
		isTraveled=bool;
	}
	
	public boolean GetTraveld()
	{
		return isTraveled;
	}
	
	public TreeNode(int _value)
	{
		value=_value;
		isTraveled = false;
	}
	
	public TreeNode() 
	{
		value = 0;
		isTraveled = false;
	}
}
