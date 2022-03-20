package testtttt;

public class avg_of_array {
	
		static double avgRec(int arr[], int a, int b)
	    {
	        if (a == b-1)
	            return arr[a];
	        if (a == 0)
	            return ((arr[a] + avgRec(arr, a+1, b))/b);
	      
	        return (arr[a] + avgRec(arr, a+1, b));
	    }
	    static double average(int arr1[], int n)
	    {
	         return avgRec(arr1, 0, n);
	    }
	    public static void main (String[] args)
	    {
	        int arr2[] = {10,20};
	        int n = arr2.length;
	      
	        System.out.println(average(arr2, n));
	    }
	}


	
