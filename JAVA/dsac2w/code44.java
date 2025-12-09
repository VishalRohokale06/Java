import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		System.out.println(zcount(num,0));
	}
	static int zcount(int n,int c){
		if(n==0){
			return c;
		}
		if(n%10==0){
			return zcount(n/10,c+1);
		}
		return zcount(n/10,c);
	}
}

