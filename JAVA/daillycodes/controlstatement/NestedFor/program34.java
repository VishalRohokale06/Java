

  class NestedDemo {
    public static void main(String[] args) {
       for(int i =1;i<=3;i++) {
	    char ch = 'a';
         for(int j =1;j<=4;j++) {
	   System.out.print((int)ch++ +" ");
	 }
	 System.out.println();
       }
    }
  }
