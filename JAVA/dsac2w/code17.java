import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String:");
		String str = sc.nextLine();
		boolean rep=false;

		for(int i=0;i<str.length()-1;i++){
			for(int j=1+i;j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					rep=true;
				}
			}
			if(rep){
			System.out.println(str.charAt(i));
			break;
			}
		}
	}
}
