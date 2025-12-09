import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter size:");
                int size = sc.nextInt();

		System.out.println("Enter qsize:");
                int q = sc.nextInt();

                int arr[] = new int[size];

                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }

                int leftMax[] = new int[size];

                leftMax[0]=arr[0];

                for(int i=1;i<size;i++){
                        leftMax[i]=Math.max(leftMax[i-1],arr[i]);
                }

                for(int i=0;i<q;i++){
			int ind = sc.nextInt();
                        System.out.println(leftMax[ind]);
                }
        }
}
