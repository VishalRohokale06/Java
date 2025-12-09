class Demo{
		static int left = 0;
                static int right = 6;
	public static void main(String[] args){

		int arr[] = {2,4,11,21,34,54,63};
		int t = 54;
		System.out.println(bsearch(arr,t));
	}

	static int bsearch(int arr[],int t){
	
			if(left>right)
				return -1;

			int mid = left+((right-left)/2);

			if(arr[mid]==t) return mid;

			if(arr[mid]<t){
				left = mid+1;
				return bsearch(arr,t);
			}else{
				right = mid-1;
				return bsearch(arr,t);
			}

	}
}
