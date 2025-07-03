import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter values:");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int max=arr[0];
		for(int i=0;i<arr.length;i++){
                        if(arr[i]>max){
				max=arr[i];
			}
		}

		for(int floor=max;floor>0;floor--){
			for(int i=0;i<arr.length;i++){
				if(arr[i]>=floor){
					System.out.print("*\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
