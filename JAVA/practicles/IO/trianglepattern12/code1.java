import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("Rows=");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(rows*rows +" ");
			}
			System.out.println();
		}
	}
}
