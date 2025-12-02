class Demo{
	public static void main(String[] args){

		int arr[] = {2,3,4,5,6};

		int q=3;

		int s[] = {1,0,2};
		int e[] = {3,2,4};

		for(int i=0;i<q;i++){
			int mul=1;
			for(int j=s[i];j<=e[i];j++){
				mul*=arr[j];
			}
			System.out.println(mul);
		}
	}
}
