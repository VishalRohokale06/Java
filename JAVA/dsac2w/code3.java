import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter num:");
		int num = sc.nextInt();

		Stack<Integer> st = new Stack<>();
		while(num>0){
			st.push(num%10);
			num/=10;
		}
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
	}
}
