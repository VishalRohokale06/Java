class Demo{
	Demo(){
		System.out.println("Constructor");
		System.out.println(this);
	}
	public static void main(String []args){
		Demo obj = new Demo();
		System.out.println(obj);
	}
}
