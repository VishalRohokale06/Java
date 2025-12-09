import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size:");
		int size = sc.nextInt();
		int arr[]= new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(isSorted(arr,0));
	}
	static boolean isSorted(int arr[],int i){
		if(i==arr.length-1){
			return true;
		}

		return arr[i]<arr[i+1] && isSorted(arr,i+1);
	}
}
