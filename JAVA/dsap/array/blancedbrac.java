import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		Stack<Character> st = new Stack<>();

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{'){
				st.push(ch);
			}else if(ch == ')'){
				boolean val = handleClosing(st,'(');
				if(!val){
				System.out.println(val);
				return;
				}
			}else if(ch == ']'){
                                boolean val = handleClosing(st,'[');
				if(!val){
				System.out.println(val);
				return;
				}
			}else if(ch == '}'){
				boolean val = handleClosing(st,'{');
				if(!val){
				System.out.println(val);
				return;
				}
			}else{
			}
		}
		if(st.size()==0){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
	}
	public static boolean handleClosing(Stack<Character> st,char corresc){
		if(st.size() == 0){
			return false;
		}else if(st.peek() != corresc){
			return false;
		}else{
			st.pop();
			return true;
		}
	}
}

