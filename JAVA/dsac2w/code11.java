import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter size:");
                int size = sc.nextInt();
               
                int arr[] = new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<size/2;i++){
			int temp = arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
		System.out.println("**********");
		for(int i=0;i<size;i++){
                System.out.println(arr[i]);
		}
        }
}
