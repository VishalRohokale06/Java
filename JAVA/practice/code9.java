import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Array:");
		int size = sc.nextInt();
		int num[] = new int[size];

		for(int i=0;i<size;i++){
			num[i] = sc.nextInt();
		}

		for(int i=0;i<size;i++){
			System.out.print(num[i]+",");
		}
	}
}

