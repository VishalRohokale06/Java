class Demo{
	public static void main(String[] args){

		int arr[] = {2,1,21,31,11,4};
		insertionSort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void insertionSort(int arr[]){

		for(int i=1;i<arr.length;i++){
			int key=arr[i];

			int j=i-1;

			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
}
