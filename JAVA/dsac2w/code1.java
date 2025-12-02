import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("x:");
		int x = sc.nextInt();
		boolean isComp=false;

		if(x<1){
			isComp=false;
		}else{
			for(int i=2;i*i<=x;i++){
				if(x%i==0){
					isComp=true;
				}
			}
		}

		if(isComp){
			System.out.println("Is comp");
		}else{
			System.out.println("Not Comp");
		}
	}
}
