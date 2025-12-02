import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int arr[] = {2,4,6,8,10};

		System.out.print("Enter no of query:");
		int q=sc.nextInt();

		for(int i=0;i<q;i++){
			int sum=0;
			int fi=sc.nextInt();
			int si=sc.nextInt();
			for(int j=fi;j<=si;j++){
				sum+=arr[j];
			}
			System.out.println(sum);
		}
	}
}


