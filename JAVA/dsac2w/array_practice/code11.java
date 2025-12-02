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
		System.out.println(transitionp(arr));
	}

	static int transitionp(int arr[]){

                for(int i=0;i<arr.length-1;i++){
                        if(arr[i]<arr[i+1])
				return i;
                }
		return -1;
        }
}
