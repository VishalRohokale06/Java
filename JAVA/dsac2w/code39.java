import java.util.*;

class Demo{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		System.out.println(rev(num,0));
	}
	static int rev(int n,int r){
		if(n==0) return r;
		return  rev(n/10,r*10+n%10);
	}
}
