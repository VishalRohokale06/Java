import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter size:");
                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i=0;i<size;i++){
                        arr[i] = sc.nextInt();
                }
                System.out.println(max(arr,0,arr[0]));

        }

        static int max(int arr[],int i,int max){
                if(i==arr.length) return max;
		if(arr[i]>max){
			max=arr[i];
		}
                return max(arr,i+1,max);
        }
}
