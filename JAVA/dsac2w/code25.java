import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter num:");
		int num = sc.nextInt();

		int temp=num;
		int count=0;
		while(temp>0){
			count++;
			temp/=10;
		}

		int tem=num;
		int sum=0;
		while(tem>0){
			int dig=tem%10;
			sum+=armstrong(dig,count);
			tem/=10;
		}
		if(num==sum){
			System.out.println("Armstrong");
		}else{
			System.out.println("Not Armstrong");
		}
	}

	static int armstrong(int dig,int count){
		int sum=1;
		while(count>0){
			sum*=dig;
			count--;
		}
		return sum;
	}
}


