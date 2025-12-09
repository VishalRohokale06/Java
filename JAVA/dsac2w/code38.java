import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		System.out.println(osqsum(num));
	}

	static int osqsum(int n){
		if(n==0) return 0;
		int d=n%10;
		//int sum=0;
		if(d%2==1){
			return d*d + osqsum(n/10);
		}
		return osqsum(n/10);
	}
}
