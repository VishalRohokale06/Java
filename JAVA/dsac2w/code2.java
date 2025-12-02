import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num for factorial:");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++){
			fact*=i;
		}
		System.out.println(fact);
	}
}
