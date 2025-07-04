import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter s1:");
		int s1 = sc.nextInt();
		System.out.println("Enter s2:");
		int s2 = sc.nextInt();

		int a1[] = new int[s1];
		int a2[] = new int[s2];

		System.out.println("Enter elements of a1:");
		for(int i=0;i<a1.length;i++){
			a1[i]=sc.nextInt();
		}
		System.out.println("Enter elements of a2:");
                for(int i=0;i<a2.length;i++){
                        a2[i]=sc.nextInt();
                }

		int diff[] = new int[s2];

		int i = a1.length-1;
		int j = a2.length-1;
		int k = diff.length-1;
		int c=0;

		while(k>=0){
			int d=0;
			int alv = i>=0?a1[i] : 0;

			if(a2[j]+c >= alv){
				d = a2[j]+c-alv;
				c=0;
			}else{
				d = a2[j]+c+10-alv;
				c=-1;
			}

			diff[k] = d;
			i--;j--;k--;
		}
		int indx = 0;
		while(indx < diff.length){
			if(diff[indx]==0){
				indx++;
			}else{
				break;
			}
		}

		while(indx < diff.length){
			System.out.print(diff[indx]);
			indx++;
		}
		System.out.println();
	}
}
