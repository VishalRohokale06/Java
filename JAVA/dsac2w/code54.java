class Demo{
	public static void main(String[] args){
		System.out.println(SumofNum(10));
	}
	static int SumofNum(int num){
		if(num==0) return 0;
		/*for(int i=0;i<=num;i++){
			sum+=i;
		}*/
		return num+SumofNum(--num);
	}
}
