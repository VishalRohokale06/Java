import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		int sum=0;
		int temp=num;
		while(num>0){
			int dig=num%10;
			sum+=fact(dig);
			num/=10;
		}
		if(sum==temp){
			System.out.println("Strong num");
		}else{
			System.out.println("Not Strong num");
		}
	}
	static int fact(int dig){
		int mul=1;
		while(dig>0){
			mul*=dig;
			dig--;
		}
		return mul;
	}
}
