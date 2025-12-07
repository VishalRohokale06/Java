class Demo{
	public static void main(String[] args){

		int arr[] = {5,4,2,3,1};

		selectionSort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void selectionSort(int arr[]){
		for(int i=0;i<arr.length-1;i++){
			int min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
