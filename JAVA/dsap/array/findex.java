import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter values:");
		for(int i=0;i<arr.length;i++){
		 arr[i] = sc.nextInt();
		}

		int flag = 0;
		System.out.println("Enter no to find index:");
		int num = sc.nextInt();
		for(int i=0;i<arr.length;i++){
                        if(num == arr[i]){
				flag=0;
				System.out.println(i);
				break;
			}else{
				flag = 1;
			}
		}
		if(flag==1){
				System.out.println("Invalid number");
		}
	}
}
