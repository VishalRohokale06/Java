import java.util.*;

class Demo{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("Enter number: ");
                int num=sc.nextInt();

		
		for(int i=10;i>=1;i--){
                System.out.print(num*i+",");
        }
}
}
