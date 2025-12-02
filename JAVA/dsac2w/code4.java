import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		/*if(num<0){
			System.out.println("No sq root");
		}else{
			double sqr = Math.sqrt(num);
			System.out.println(sqr);
		}*/

		int s=1,e=num;		
		int res=1;
		while(s<=e){
			int mid = (s+e)/2;

			if(mid*mid<=num){
				res=mid;
				s=mid+1;
			}else{
				e=mid-1;
			}
			
		}
		System.out.println(res);
	}

}
