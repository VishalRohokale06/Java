import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("size:");
                int size=sc.nextInt();

                int arr[] = new int[size];

                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();
                }

                int min=arr[0];
		int secmin=arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]>min && arr[i]<secmin){
				secmin=arr[i];
			}
		}

		System.out.println(secmin);
        }
}
