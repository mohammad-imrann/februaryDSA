package testtttt;

public class maxmin_recursion {
	public static int findMinRec(int A[], int n)
    {
		 if(n == 1)
		        return A[0];
		         
		        return Math.min(A[n-1], findMinRec(A, n-1));
		    }
	 public static void main(String args[])
	    {
	        int A[] = {0,2,3,4,5,6,7};
	        int n = A.length;
	         
	        // Function calling
	        System.out.println(findMinRec(A, n));
	    }
	}
  