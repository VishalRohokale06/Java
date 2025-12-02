class Demo{
	public static void main(String[] args){

		int arr[] = {10,20,30,4,0};
		System.out.println(issort(arr));
	}
	static int issort(int arr[]){
		int j=arr.length-1;
		for(int i=0;i<arr.length/2;i++){
			if(arr[i]<=arr[j]){
				j--;
			}else{
				return 0;
			}
		}
		return 1;
	}
}
