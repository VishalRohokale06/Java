class Demo{
	public static void main(String[] args){

		int arr[] = {5,3,4,2,1};
		insertionSort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

	}

	static void insertionSort(int arr[]){

		for(int i=1;i<arr.length;i++){
			for(int j=i-1;j>=0;j--){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
