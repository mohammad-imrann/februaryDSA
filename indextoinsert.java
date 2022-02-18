package feb_assignment;

public class indextoinsert {
	
	static int findindex_to_insertinorder(int[]arr,int target) {
		int x=0;
		while(x<arr.length)
			if(arr[x]==target)
				return x;
			else if(arr[x]>target)
				return x;
			else
				x++;
				
		return target;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,3,5,6};
		int target=2;
		System.out.println(findindex_to_insertinorder(arr, target));

	}

}
