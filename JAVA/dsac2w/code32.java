import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		System.out.println(fact(num));
	}
	static int fact(int n){
		if(n==0){
			return 1;
		}
		return n* fact(n-1);
	}
}
