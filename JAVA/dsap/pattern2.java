import java.util.*;

class Demo{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();

		for(int i=rows;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}
}
