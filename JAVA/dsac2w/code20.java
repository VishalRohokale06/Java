import java.util.*;

class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String:");
		String str = sc.nextLine();

		HashMap<Character, Integer> map = new HashMap<>();

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch,map.get(ch)+1);
			}else{
				map.put(ch,1);
			}
		}

		List<Character> keys = new ArrayList<>(map.keySet());
		for(int i=0;i<keys.size();i++){
			char key = keys.get(i);
			System.out.println(key+":"+map.get(key));
		}
	}
}
