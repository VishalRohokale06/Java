import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("num:");
		int num = sc.nextInt();

		System.out.println(sum(num));
	}
	static int sum(int n){
		if(n==0){
			return 0;
		}
		return n+sum(n-1);
	}
}
