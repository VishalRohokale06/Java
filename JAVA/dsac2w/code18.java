import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String:");
		String str = sc.nextLine();

		boolean visited[] = new boolean[str.length()];

		for(int i=0;i<str.length();i++){
			char ch1 = str.charAt(i);
			if(visited[i]) continue;

			int count=1;
			for(int j=i+1;j<str.length();j++){
				char ch2 = str.charAt(j);
				if(ch1==ch2){
					count++;
					visited[j]=true;
				}
			}
			System.out.println(ch1+":"+count);
		}
	}
}
