import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		ArrayList<Integer> list = new ArrayList<>();

		for(int i=0;i<size;i++){
			if(isComposite(arr[i])){
				list.add(arr[i]);
			}
		}
		System.out.println(list);

	}

	static boolean isComposite(int num){
		if(num<2){
			return false;
		}

		int count=0;
		for(int i=2;i*i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count>0){
			return true;
		}
		return false;
	}
}
