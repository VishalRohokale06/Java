

  class NestedDemo {
    public static void main(String[] args) {
      int num = 1;
      char ch ='A';
      for(int i =1;i<=4;i++) {
        for(int j =1;j<=3;j++) {
	  if(i%2==1) {
	    System.out.print(num++ +" ");
	  }else{
	    System.out.print(ch++ +" ");
	  
	  }
	  
	} 
	    System.out.println();
	  
      }
    }
  }
