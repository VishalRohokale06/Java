class Demo{
	public static void main(String[] args){

		int num=123;
		System.out.println(prodig(num,0));
	}

	static int prodig(int num,int rev){
		if(num==0) return rev;

		return prodig(num/10, rev*10+num%10);
	}
}
