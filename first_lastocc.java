package feb_assignment2;

public class first_lastocc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,1,2,3,4,5,6,7,1,1};
        int target=1;

        int pos1=-1;
        boolean present1=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
            	present1=true;
                pos1=i;
                break;
            }
        }
        boolean present2=false;
        int pos2=-1;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                present2=true;
                pos2=i;
            }
        }
        if(present1||present2){
            System.out.println(pos1);
            System.out.println(pos2);
        }
        else{
            System.out.println("not present");
        }
	}

}
