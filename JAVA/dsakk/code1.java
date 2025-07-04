import java.util.*;

class Demo{
	public static void main(String[] args){

		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int target = 5;
		int[] ans = search(arr,target);
		System.out.println(Arrays.toString(ans));
	}

	public static int[] search(int arr[][],int t){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==t){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
}
