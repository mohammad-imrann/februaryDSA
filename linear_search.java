package feb_assignment2;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int target=5;int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				count++;
			}			
		}
		if(count>0)
		{
			System.out.println("target found");
		}
		else
		{
			System.out.println("invalid target");
		}
	}

}
