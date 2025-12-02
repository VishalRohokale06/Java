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

		System.out.println(firstrepe(arr,size));
	}

	static int firstrepe(int arr[],int size){

                for(int i=0;i<size-1;i++){
			for(int j=1;j<size;j++){
				if(arr[i]==arr[j]) return i;
			}
		}
		return -1;
	}
}
