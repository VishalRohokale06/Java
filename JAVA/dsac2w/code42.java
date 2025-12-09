import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(avg(arr,0)/size);

	}

	static float avg(int arr[],int i){
		if(i==arr.length) return 0;
		return arr[i]+avg(arr,i+1);
	}
}
