import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size-1];

		for(int i=0;i<size-1;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(missingNum(arr,size));
	}



	static int missingNum(int arr[],int n){
		int tsum=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
	return tsum-sum;
	}
}
