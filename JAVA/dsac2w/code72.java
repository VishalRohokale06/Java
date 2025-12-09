class Demo{
	public static void main(String[] args){

		int arr[] = {2,4,11,21,34,54,63};
		int t = 54;
		System.out.println(bsearch(arr,t));
	}

	static int bsearch(int arr[],int t){
		int left = 0;
		int right = arr.length;

		while(left<=right){

			int mid = left+(right-left)/2;

			if(t==arr[mid])
				return mid;
			else if(arr[mid]<t)
				left = mid+1;
			else
				right= mid-1;
			
		}
		return -1;
	}
}
