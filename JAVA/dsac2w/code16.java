import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter str:");
		String str = sc.nextLine();

		int vcount=0;
		int ccount=0;

		int i=0;
		while(i<str.length()){
			if(str.charAt(i)=='A' || str.charAt(i)=='a' ||
		           str.charAt(i)=='E' || str.charAt(i)=='e' ||
			   str.charAt(i)=='I' || str.charAt(i)=='i' ||
			   str.charAt(i)=='O' || str.charAt(i)=='o' ||
			   str.charAt(i)=='U' || str.charAt(i)=='u' ){
				vcount++;
			   }else{
				   ccount++;
			   }
			i++;
		}
		System.out.println("VowelCount:"+vcount);
		System.out.println("ConsonentCount:"+ccount);
	}
}
