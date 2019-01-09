package practice;

public class LinkedArray {
	public int value;
	public LinkedArray next = null;
	
	public LinkedArray(int _value)
	{
		value = _value;
	}
	
	public void SetNext(LinkedArray arr)
	{
		next = arr;
	}
	
	public void DeleteNext()
	{
		next = null;
	}
}
