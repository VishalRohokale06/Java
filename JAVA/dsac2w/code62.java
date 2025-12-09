class Demo{
	public static void main(String[] args){
		fun();
	}
	static void fun(){
		System.out.println("In fun");
		fun();
	}
}
