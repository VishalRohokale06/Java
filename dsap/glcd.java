import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();

		int on1=n1;
		int on2=n2;
		int rem=0;
		while(n1%n2!=0){
			rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd = n2;
		int lcd=(on1*on2)/gcd;
		System.out.println(gcd);
		System.out.println(lcd);
	}
}
