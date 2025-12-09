import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("size:");
		int size=sc.nextInt();

		int arr[] = new int[size];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println(firstRepEle(arr));
	}
	public static int firstRepEle(int arr[]){
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
					if(count>0){
						return i;
					}
				}
			}
			count=0;
		}
		return -1;
	}
}
