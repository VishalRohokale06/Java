import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int size = sc.nextInt();

		System.out.println("Enter k:");
		int k = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println(countPair(arr,k));
	}

	static int countPair(int arr[],int k){
		int count=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]+arr[j] == k){
					count++;
				}
			}
		}
		return count;
	}
}

