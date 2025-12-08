import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		System.out.println(count(num));
	}

	static int count(int n){
		if(n==0) return 0;

		return 1+ count(n/10);
	}
}
