class Demo{
	public static void main(String[] args){

		int arr[]={7,3,2,-1,6,8,2,5};

		int si=2;
		int sum=0;

		for(int i=si;i<arr.length;i++){
			sum+=arr[i];
			System.out.println(sum);
		}
	}
}
