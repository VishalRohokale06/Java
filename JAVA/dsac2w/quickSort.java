class Demo{
	public static void main(String[] args){

		int arr[] = {2,4,5,1,6,9};
		mergeSort(arr,0,arr.length-1);
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ,");
		}
		System.out.println();
	}

	static void mergeSort(int arr[],int start,int end){
		if(start>=end) return;

		int pivotIndex = merge(arr,start,end);

		mergeSort(arr,start,pivotIndex-1);
		mergeSort(arr,pivotIndex+1,end);
	}

	static int merge(int arr[],int start,int end){

		int pivot = arr[end];
		int pivotIndex = start-1;

		for(int i=start;i<end;i++){
			if(arr[i]<pivot){
				pivotIndex++;
				int temp = arr[i];
				arr[i] = arr[pivotIndex];
				arr[pivotIndex] = temp;
			}
		}

		pivotIndex++;
                int temp = arr[end];
                arr[end] = arr[pivotIndex];
                arr[pivotIndex] = temp;

		return pivotIndex;
	}
}

