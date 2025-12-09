class Demo{
	public static void main(String[] args){
		System.out.println(fun(2,0));
	}

	static int fun(int num){
		if(num<=0){
			return 1;
		}

		int ans1 = num + fun(num-1);
		System.out.println(ans1);

		int ans2 = num + fun(num-2);
		System.out.println(ans2);

		return ans1+ans2;
	}

}
