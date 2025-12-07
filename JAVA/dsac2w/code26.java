import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		String num = sc.next();
		boolean isDuck=false;

		if(num.charAt(0)=='0'){
			System.out.println("Not Duck num");
			return;
		}

		for(int i=0;i<num.length();i++){
			if(num.charAt(i)=='0'){
				isDuck=true;
				break;
			}
		}

		if(isDuck){
			System.out.println("Duck num");
		}else{
			System.out.println("Not Duck num");
		}
	}
}
