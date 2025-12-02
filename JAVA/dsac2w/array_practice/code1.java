import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(missingNum(arr));
	}



	static int missingNum(int arr[]){

		for(int i=0;i<arr.length;i++){
			if(arr[i]-1!=i){
				return arr[i]-1;
			}
		}
	return -1;
	}
}
