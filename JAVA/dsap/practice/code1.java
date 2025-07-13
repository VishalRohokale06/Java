import java.util.*;
import java.io.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//ArrayList ar = new ArrayList();
		//ar.add(1);

		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int arr[][] = new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int arr1[]=new int[rows];
		for(int i=0;i<rows;i++){
			int sum=0;
			for(int j=0;j<=cols;j++){
				 sum+=arr[i][j];
			}
			arr1[i]=sum;
		}
		int max=Integer.MIN_VALUE;
		int mval=0;
		for(int i=0;i<rows;i++){
			if(arr1[i]>=max){
			//	max=arr[i];
				mval=i;
			}
		}
		System.out.println(mval);
	}
}
