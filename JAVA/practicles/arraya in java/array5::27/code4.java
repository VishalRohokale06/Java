import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the element of array:");
		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
                outer : for(int i=0;i<size;i++){
			int ele=arr[i];
			for(int j=0;j<size;j++){
				if(ele==arr[j] && i!=j){
					System.out.println("First duplicate element present at index"+i);
					break outer;
				}
			}
		}
	}
}



