import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size:");
		int size = sc.nextInt();
		int ecount=0,ocount=0;

		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++){
                        if(arr[i]%2==0){
				ecount++;
			}else{
				ocount++;
			}
                }
		System.out.println(ecount);
		System.out.println(ocount);
	}
}
