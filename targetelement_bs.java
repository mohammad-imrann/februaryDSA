package feb_assignment;

public class targetelement_bs {
	public static int targelem_binarysearch(char[]arr,char target)
	{
		int low=0;
		int high=arr.length;
		
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else if((int)arr[mid]<target)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return -1;
	}
				
		public static void main(String[] args) {
		
			char []arr= {'a','b','d','e','f','g','h','i','x','z'};
			char target='z';
			
			int res=targelem_binarysearch(arr,target);
			System.out.println(res);

	}

}
