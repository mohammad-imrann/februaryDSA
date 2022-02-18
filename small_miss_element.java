package feb_assignment;

public class small_miss_element {
	static int findingsmall_missingelem(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=i)
				return i;	
		}
		return arr.length;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1[]= {0,1,2,6,9,11,15};
		int num2[]= {1,2,3,4,6,9,11,15};
		int num3[]= {0,1,2,3,4,5,6};

		System.out.println("smallest missing element is:"+findingsmall_missingelem(num1));
		System.out.println("smallest missing element is:"+findingsmall_missingelem(num2));	
		System.out.println("smallest missing element is:"+findingsmall_missingelem(num3));


	}

}
