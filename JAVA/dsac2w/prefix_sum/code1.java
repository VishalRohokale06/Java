class Demo{
	public static void main(String[] args){

		int arr[] = {-3,6,2,4,5,2,8,-9,3,1};
		int start = 1;
		int end = 3;
		int sum=0;

		for(int i=start;i<=end;i++){
			sum+=arr[i];
		}

		System.out.println(sum);
	}
}
