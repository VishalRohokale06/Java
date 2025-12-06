import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter num:");
                int num=sc.nextInt();

                int rev=0;
                while(num>0){
			int dig=num%10;
			rev=rev*10+dig;
                        num/=10;
                }
                System.out.println(rev);
        }
}
