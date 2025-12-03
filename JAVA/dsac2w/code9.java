import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter size:");
                int size = sc.nextInt();
                float sum=0;

                float arr[] = new float[size];
                for(int i=0;i<size;i++){
                        arr[i]=sc.nextInt();
                }
                for(int i=0;i<size;i++){
                        sum+=arr[i];
                }
		float avg = sum/size;
                System.out.println(avg);
        }
}
