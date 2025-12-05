import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter num:");
		int size = sc.nextInt();

		int num[] = new int[size];

		for(int i=0;i<num.length;i++){
			num[i] = sc.nextInt();
		}

		HashMap<Integer,Integer> map = new HashMap<>();

		for(int arr:num){
			map.put(arr,map.getOrDefault(arr,0)+1);
		}

		for(int key:map.keySet()){
			System.out.println(key+":"+map.get(key));
		}
        }
}
