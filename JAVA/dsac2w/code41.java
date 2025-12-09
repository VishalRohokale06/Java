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
		System.out.println("Even count:"+ecount(arr,0)+"\n"+"Odd count:"+ocount(arr,0));
	}
	static int ecount(int arr[],int i){
		if(i==arr.length) return 0;
		if(arr[i]%2==0){
			return 1+ecount(arr,i+1);
		}
		return ecount(arr,i+1);
	}

	static int ocount(int arr[],int i){
                if(i==arr.length) return 0;
                if(arr[i]%2==1){
                        return 1+ocount(arr,i+1);
                }
                return ocount(arr,i+1);
        }
}

