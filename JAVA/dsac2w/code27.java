class Demo{
	public static void main(String[] args){

		String[] word = {"hello", "java", "madam", "racecar", "world"};

		String result = firstPalidrom(word);

		if (result != null) {
            		System.out.println("First palindrome: " + result);
        	} else {
            		System.out.println("No palindrome found");
        	}
	}

	static String firstPalidrom(String arr[]){
		for(String word:arr){
			if(isPalidrom(word)){
				return word;
			}
		}
		return null;
	}

	static boolean isPalidrom(String word){
		String str = word;
		int left=0;
		int right=word.length()-1;

		while(left<right){
			if(str.charAt(left)!=str.charAt(right)){
				return false;

			}
			left++;
			right--;
		}
		return true;
	}
}
