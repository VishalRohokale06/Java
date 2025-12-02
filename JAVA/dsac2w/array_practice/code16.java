class Demo{
	public static void main(String[] args){

		int arr[] = {1,1,2,2,2,2,3};
		int t=2;
		int count=0;

		int left=0;
		int right=arr.length-1;

		while(left<right){
			int mid = left+(right-left)/2;
			if(t==arr[mid]){
				count++;
			}
			if(left<mid){
				left++;
			}else{
				right--;
			}
		}
		System.out.println(count);
	}
}



