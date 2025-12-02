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
		sortArr(arr);
		for(int i=0;i<size;i++){
                        System.out.println(arr[i]);
                }
	}
	static void sortArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[i]){
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
}
