import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size:");
		int size = sc.nextInt();
		System.out.println("Enter elements:");
		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(arr[i]>5 && arr[i]<9){
				System.out.println(arr[i] +" is greater than 5 but less than 9");
			}
		}
	}
}
