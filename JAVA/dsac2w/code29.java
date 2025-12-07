import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.print("x:");
                int x = sc.nextInt();
                System.out.print("y:");
                int y = sc.nextInt();

                String arr[][] = new String[x][y];

                for(int i=0;i<x;i++){
                        for(int j=0;j<y;j++){
                                arr[i][j]=sc.next();
                        }
                }

		ArrayList<String> list = new ArrayList<>();

		for(int i=0;i<x;i++){
                        for(int j=0;j<y;j++){
                                String str = arr[i][j];
				String result = str.toLowerCase();
				char ch = result.charAt(0);
				if(ch == 'a'|| ch == 'e' ||
				   ch == 'i'|| ch == 'o' ||
				   ch == 'u'){
				   }else{
					   list.add(str);
				   }

                        }
                }

		System.out.println(list);
	}
}
