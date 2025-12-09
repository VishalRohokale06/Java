class Demo{
        public static void main(String[] args){
                int arr[] = {3,-1,4};

                int prefArr[] = new int[arr.length];
		prefArr[0]=arr[0];

                for(int i=1;i<arr.length;i++){
			prefArr[i]=prefArr[i-1]+arr[i];
                }

		int sum=0;
		int prefSum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			prefSum+=prefArr[i];
		}
                System.out.println(prefSum+sum);
        }
}
