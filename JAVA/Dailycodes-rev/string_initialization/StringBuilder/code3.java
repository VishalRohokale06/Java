class StringBufferDemo{
	public static void main(String[] args){

		StringBuffer sb = new StringBuffer("Vishal");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.capacity());

		sb = sb.append("Rohokale");
                System.out.println(sb);
                System.out.println(System.identityHashCode(sb));
                System.out.println(sb.capacity());
	}
}
