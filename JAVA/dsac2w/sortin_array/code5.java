class Demo{
	public static void main(String[] args){

		int arr[] = {2,3,1,8,6,4,9,11,5};

		mergeSort(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void mergeSort(int arr[],int start,int end){
		if(start>=end) return;
		int mid = (start+end)/2;

		mergeSort(arr,start,mid);
		mergeSort(arr,mid+1,end);
		merge(arr,start,mid,end);
	}

	static void merge(int arr[],int start,int mid,int end){
		int n1 = mid-start+1;
		int n2 = end-mid;

		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];

		for(int i=0;i<n1;i++){
			leftArr[i]=arr[start+i];
		}

		for(int j=0;j<n2;j++){
			rightArr[j]=arr[mid+1+j];
		}

		int i=0;
		int j=0;
		int k=start;

		while(i<n1 && j<n2){
			if(leftArr[i]<rightArr[j]){
				arr[k]=leftArr[i];
				i++;
			}else{
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}

		while(i<n1){
			arr[k]=leftArr[i];
                        i++;
			k++;
		}

		while(j<n2){
                        arr[k]=rightArr[j];
                        j++;
                        k++;
                }
	}
}
