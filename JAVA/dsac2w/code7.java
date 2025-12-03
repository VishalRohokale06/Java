import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		int temp = num;
		int rev=0;

		while(temp>0){
			int dig=temp%10;
			rev=rev*10+dig;
			temp/=10;
		}
		if(num==rev){
			System.out.println("Palidrom");
		}else{
			System.out.println("Not");
		}
	}
}
