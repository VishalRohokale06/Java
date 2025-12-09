class Demo{
        public static void main(String[] args){
                int arr[] = {3,-1,4};

		int tsum=0;
                for(int i=0;i<arr.length;i++){
			int sum=0;
                        for(int j=i;j<arr.length;j++){
                                sum+=arr[j];
				tsum+=sum;
                        }
                }
		System.out.println(tsum);
        }
}
