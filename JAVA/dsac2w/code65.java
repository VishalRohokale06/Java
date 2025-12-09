class Demo{
	public static void main(String[] args){
		System.out.println(fact(5));
	}

	static int fact(int num){
		if(num==0) return 1;
		return num * fact(--num);
		/*int f=1;
		while(num>0){
			f*=num%10;
			num--;
		}
		return f;*/
	}
}
