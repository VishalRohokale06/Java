class Demo{
	public static void main(String[] args){
		int arr[] = {2,8,9};

		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=i;j<arr.length;j++){
				sum+=arr[j];
				System.out.println(sum);
			}
		}
	}
}
