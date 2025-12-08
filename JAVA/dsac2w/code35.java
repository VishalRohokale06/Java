import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter num:");
                int num = sc.nextInt();

		int rev = isPalidrom(num,0);
		if(num==rev){
	                System.out.println("Palidrom");
		}else{
			System.out.println(rev);
		}
        }

        static int isPalidrom(int n,int rev){
                if(n==0) return rev;

                return isPalidrom(n/10,rev=rev*10+n%10);
        }
}
