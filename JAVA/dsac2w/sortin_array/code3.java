import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter element:");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		insertionSort(arr);
		for(int i=0;i<size;i++){
                        System.out.println(arr[i]);
                }
	}

	static void insertionSort(int arr[]){

		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j>0;j--){
				 if(arr[j-1]>arr[j]){
                                        int temp = arr[j];
                                        arr[j] = arr[j-1];
                                        arr[j-1] = temp;
                                  
                                }
			}
		}
	}
}

