import java.util.*;
class OneDInput{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter array size");
                int arrSize = sc.nextInt();
                int arr[] = new int[arrSize];
		System.out.println("Enter Element:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                }
        }
}
