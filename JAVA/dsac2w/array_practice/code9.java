import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}

		boolean flag = true;

		for(int i=0;i<size-1;i++){
			if(arr[i]>arr[i+1]){
				flag=false;
			}
		}
		if(flag){
		System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}
