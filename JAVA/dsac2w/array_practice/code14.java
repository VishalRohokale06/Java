class Demo{
	public static void main(String[] args){

		int arr[] = {1,5,3,4,3,5,6};
		System.out.println(rep(arr));
	}

	static int rep(int arr[]){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]==arr[j])
					return i;
			}
		}
		return -1;
	}
}
