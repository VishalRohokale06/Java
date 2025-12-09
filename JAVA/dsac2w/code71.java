class Demo{
	public static void main(String[] args){

		int num=5;
		
		for(int i=0;i<num;i++){
			System.out.println(fibo(i));
		}
	}

	static int fibo(int num){
		if(num==0) return 0;
		if(num==1) return 1;

		return fibo(num-1)+fibo(num-2);
	}
}
