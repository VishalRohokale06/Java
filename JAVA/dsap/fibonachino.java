class Fibona{
	public static void main(String[] args){

		int a=0;
		int b=1;
		for(int i=1;i<=10;i++){
			int c=a+b;
			System.out.println(a);
			a=b;
			b=c;
		}
	}
}
