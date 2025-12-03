import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter size:");
                int size = sc.nextInt();
                int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		
                int arr[] = new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
		int secondMax=arr[0];
                for(int i=0;i<size;i++){
                        if(arr[i]>max){
				max=arr[i];
			}else if(arr[i]>secondMax && arr[i]<max){
				secondMax=arr[i];
			}else if(arr[i]<min){
				min=arr[i];
			}
                               
                }
                System.out.println(max);
		System.out.println(min);
		System.out.println(secondMax);
        }
}
