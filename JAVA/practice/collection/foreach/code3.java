import java.util.*;

class ForEachDemo{
	public static void main(String[] args){

		ArrayList<Object> al = new ArrayList<Object>();

		al.add(10);
		al.add(20);
		al.add("VR");
		al.add(40);
		al.add(50);

		System.out.println(al);

		for(Object x:al){
			System.out.println(x);
		}
	}
}
