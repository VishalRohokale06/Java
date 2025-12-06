import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("S1:");
		int s1 = sc.nextInt();
		System.out.print("s2:");
		int s2 = sc.nextInt();

		int arr[][] = new int[s1][s2];

		for(int i=0;i<s1;i++){
			for(int j=0;j<s2;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int sum1=0;
		int sum2=0;

		for(int i=0;i<s1;i++){
                        for(int j=0;j<s2;j++){
		        	if(i==j){
				sum1+=arr[i][j];
				}	
			}
		}

		int i=0;
		int j=s2-1;
		while(i<s1){
			sum2+=arr[i][j];
			i++;
			j--;
		}

                System.out.println(sum1);
		System.out.println(sum2);
            
	}
}
