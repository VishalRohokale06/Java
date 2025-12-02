class Demo{
        public static void main(String[] args){

                int arr[] = {3,3,3,3};
                for(int i=0;i<arr.length;i++){
			int count=0;
			for(int j=0;j<arr.length;j++){
				if(i+1==arr[j]) count++;
			}
			System.out.println(count);
		}
	}
}
