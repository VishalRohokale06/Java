import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size :");
		int size = sc.nextInt();
		System.out.println("Enter elements:");
		int arr[] = new int[size];
		int min=arr[0];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
			if(min>arr[i]){
				min=arr[i];
			}
		}
		System.out.println("Minimum number in the array is :"+min);
	}
}

		
