import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		System.out.println(factor(num,1));
	}
	static int factor(int n,int i){
		if(i>n) return 0;
		if(n%i==0){
			return 1+factor(n,i+1);
		}
		return factor(n,i+1); 
	}
}
		
