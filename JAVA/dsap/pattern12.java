import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int rows = sc.nextInt();
		int n1=0;
		int n2=1;

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(n1+"\t");
				int sum = n1+n2;
				n2=n1;
				n1=sum;
			}
			System.out.println();
		}
	}
}
