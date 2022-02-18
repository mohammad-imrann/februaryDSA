package feb_assignment;

public class findfrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr=new int[] {1,1,2,2,4,5,5,6,6,6,6,9,10,11};
		int []visitedarr=new int[arr.length];
		int visited=-1;
		
		for(int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
				visitedarr[j]=visited;
			}
			if(visitedarr[i]!=visited)
			{
				visitedarr[i]=count;
			}
			
		}
		for(int i=0;i<visitedarr.length;i++)
		{
			if(visitedarr[i]!=visited)
			{
				System.out.println("Frequency of "+arr[i]+" : "+visitedarr[i]);
			}
		}
	}

}
