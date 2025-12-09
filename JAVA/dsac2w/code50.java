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

                for(int i=0;i<arr.length;i++){
			int num = arr[i];
			int res=0;
			int place=1;
			while(num>0){
				int dig=num%10;
				if(dig==0){
					dig=5;
				}
				res=res+dig*place;
				place=place*10;
				num/=10;
			}
			arr[i]=res;
		}

		for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                }

	}
}	
