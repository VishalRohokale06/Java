import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		String str = sc.nextLine();

		if(isPalidrom(str,0,str.length()-1)){
			System.out.println("Palidrom");
		}else{
			System.out.println("Not");
		}
	}
	static boolean isPalidrom(String str,int left,int right){
		if(left>right){
			return true;
		}
		if(str.charAt(left) != str.charAt(right)) return false;
		return isPalidrom(str,left+1,right-1);
	}
}
		
