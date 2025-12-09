import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter size:");
                int size =sc.nextInt();

                int arr[] = new int[size];

                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }

		int count=0;

                for(int i=0;i<arr.length;i++){
                        if(isPalidrom(arr[i]))
				count++;
		}
		System.out.println(count);
	}
	public static boolean isPalidrom(int num){
		int temp=num;
		int rev=0;
		while(temp>0){
			int dig=temp%10;
			rev=rev*10+dig;
			temp/=10;
		}
		if(rev==num) return true;
		return false;
	}
}
