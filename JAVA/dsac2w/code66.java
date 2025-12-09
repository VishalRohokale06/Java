class Demo{
	public static void main(String[] args){

		System.out.println(sdig(123));
	}

	static int sdig(int num){
		if(num==0) return 0;
		return num%10+sdig(num/10);
	}
}
