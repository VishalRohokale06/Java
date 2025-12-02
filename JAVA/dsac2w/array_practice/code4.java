import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int size=sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr);
		for(int i=0;i<size;i++){
                        System.out.println(arr[i]);
		}
	}

	static void sort(int arr[]){
		int low=0,mid=0,high=arr.length-1;

		while(mid<=high){
			if(arr[mid]==0){
				int temp = arr[low];
				arr[low] = arr[mid];
				arr[mid] = temp;
				low++;
				mid++;
			}else if(arr[mid]==1){
				mid++;
			}else{
				int temp = arr[mid];
				arr[mid] = arr[high];
				arr[high] = temp;
				high--;
			}
		}
	}
}
