class Parent{
	void marry(){
		System.out.print('a');
	}
}
class Demo{
	void fun(Parent obj){
		obj.marry();
	}
}
class Outer{
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun(new Parent(){
			void marry(){
				System.out.println('P');
			}
		});
	}
}
