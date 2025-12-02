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

		for(int i=0;i<size;i++){
			if(i==0){
				if(arr[i]>arr[i+1]){
					System.out.println(i);
					break;
				}
			}else if(i==size-1){
				if(arr[i]>arr[i-1]){
                                        System.out.println(i);
                                        break;
                                }
			}else{
				if(arr[i]>arr[i+1] && arr[i]>arr[i-1]){
					System.out.println(i);
					break;
				}
			}
		}
	}
}
