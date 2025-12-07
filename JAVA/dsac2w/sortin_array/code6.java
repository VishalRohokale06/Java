class Demo{
	public static void main(String[] args){

		int arr[] = {4,1,3,9,7};

		quickSort(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void quickSort(int arr[],int start,int end){
		if(start>=end) return;

		int pivotIndex = merge(arr,start,end);
		quickSort(arr,start,pivotIndex-1);
		quickSort(arr,pivotIndex+1,end);
	}

	static int merge(int arr[],int start,int end){
		int pivot = arr[end];
		int pivotIndex = start-1;

		for(int i=start;i<end;i++){
			if(arr[i]<pivot){
				pivotIndex++;
				int temp=arr[i];
				arr[i]=arr[pivotIndex];
				arr[pivotIndex]=temp;
			}
		}
		pivotIndex++;
                int temp=arr[end];
                arr[end]=arr[pivotIndex];
                arr[pivotIndex]=temp;
		return pivotIndex;

	}
}
