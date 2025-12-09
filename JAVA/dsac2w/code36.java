import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		System.out.println(esum(num));
	}
	static int esum(int n){
		if(n==0) return 0;
		int d=n%10;
		if(d%2==0){
			return d+esum(n/10); 
		}
		return esum(n/10);
	}
}
