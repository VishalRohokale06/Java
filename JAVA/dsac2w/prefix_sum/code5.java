class Demo{
	public static void main(String[] args){

		int arr[] = {7,2,5,1,9,3};

		int rightMin[] = new int[arr.length];
		rightMin[arr.length-1] = arr[arr.length-1];

		for(int i=arr.length-2;i>=0;i--){
			if(rightMin[i+1]<arr[i]){
				rightMin[i]=rightMin[i+1];
			}else{
				rightMin[i]=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(rightMin[i]);
		}
	}
}
