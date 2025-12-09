class Demo{
	public static void main(String[] args){
		printNum(1);
	}

	static void printNum(int num){
		if(num>10) return;
		System.out.println(num);
		printNum(num+1);
	}
}
