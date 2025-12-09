import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter size:");
                int size =sc.nextInt();

		System.out.print("x:");
		int x=sc.nextInt();

                int arr[] = new int[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }

		int first=-1,last=-1;

                for(int i=0;i<arr.length;i++){
                        if(arr[i]==x){
                                if(first==-1) first=i;
				last=i;
                        }
                }
		if(first==-1){
			System.out.println("-1");
		}
		else{
			System.out.println(first+" "+last);
		}
        }
}
