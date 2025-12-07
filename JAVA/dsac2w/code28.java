import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("x:");
		int x = sc.nextInt();
		System.out.print("y:");
		int y = sc.nextInt();

		int arr[][] = new int[x][y];

		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<x;i++){
                        for(int j=0;j<y;j++){
                                if(cube(arr[i][j])%2==1){
					System.out.println(arr[i][j]);
				}
                        }
                }
	}
	static int cube(int num){
                        return num*num*num;
        }
}
