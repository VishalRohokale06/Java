class Demo{
	public static void main(String[] args){

		int arr[] = {4,3,1,2,5};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void selectionSort(int arr[]){

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
			}
		}

	}	
}
