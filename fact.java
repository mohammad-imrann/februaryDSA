package testtttt;

public class fact {
	static int fact(int a) {
		if(a==1) return a;
		return a*fact(a-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=fact(5);
		System.out.println(result);

	}

}

