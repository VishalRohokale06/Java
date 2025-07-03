import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Size 1st arr:");
		int s1=sc.nextInt();
		System.out.println("Size 2nd arr:");
		int s2=sc.nextInt();

		int a1[] = new int[s1];
		int a2[] = new int[s2];

		System.out.println("Elements of a1:");
		for(int i=0;i<a1.length;i++){
			a1[i]=sc.nextInt();
		}
		System.out.println("Elements of a2:");
		for(int i=0;i<a2.length;i++){
                        a2[i]=sc.nextInt();
                }

		int sum[] = new int[s1>s2?s1:s2];

		int i = a1.length-1;
		int j = a2.length-1;
		int k = sum.length-1;
		int c=0;

		while(k>=0){
			int d = c;

			if(i>=0)
				d+=a1[i];
			if(j>=0)
				d+=a2[j];

			c=d/10;
			d%=10;

			sum[k]=d;

			k--;i--;j--;
		}

		if(c!=0){
			System.out.print(c);
		}
		for(int val:sum){
			System.out.print(val);
		}
		System.out.println();
	}
}
