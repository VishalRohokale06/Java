import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n:");
		int n= sc.nextInt();

		int a=0,b=1;
		System.out.println(a+"\n"+b);
		for(int i=2;i<n;i++){
			int c=a+b;
			a=b;
			b=c;	
			System.out.println(c);
		}
	}
}
