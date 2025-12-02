import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size:");
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		ArrayList<Integer> duplicate = sort(arr);
		for(int num:duplicate){
			System.out.println(num);
		}
	}

	static ArrayList<Integer> sort(int arr[]){

		ArrayList<Integer> dupli = new ArrayList<>();

		for(int i=0;i<arr.length;i++){
			int index = arr[i]%arr.length;
			arr[index] += arr.length;
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]/arr.length>=2){
				dupli.add(i);
			}
		}
		return dupli;
	}
}
