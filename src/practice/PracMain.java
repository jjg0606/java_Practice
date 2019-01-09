package practice;

public class PracMain {
	public static void main(String[] args) {
//		LinkContainer lc = new LinkContainer();
//		SortableArray sta = new SortableArray(new int[] {45,6,3,8,5,1,4,2,3,55,48,43,3,12,9,1});
//
//		sta.MergeSort();
//		sta.Print();
		BinarySearchTree bst = new BinarySearchTree();
		bst.Insert(new int[] {5,4,2,7,6,8,9});
		int[] bstarr = bst.PostorderTravelsal();
		
		for(int i =0;i<bstarr.length;i++)
		{
			System.out.print(bstarr[i]+" ");
		}
	}
}

