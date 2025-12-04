class Demo{
	public static void main(String[] args){
		int arr[] = {11,2,13,22,1,4,22};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void insertionSort(int arr[]){

		for(int i=1;i<arr.length;i++){
			int key = arr[i];
			int j=i-1;
			for(;j>=0;j--){
				if(arr[j]>key){
					arr[j+1]=arr[j];
				}else{
					break;
				}
			}
			arr[j+1]=key;
		}
	}
}
