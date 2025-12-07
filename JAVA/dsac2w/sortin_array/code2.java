class Demo{
	public static void main(String[] args){
		int arr[] = {4,1,3,9,7};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void bubbleSort(int arr[]){
		int itr=0;
		for(int i=0;i<arr.length;i++){
			boolean swap=false;
			for(int j=0;j<arr.length-1-i;j++){
				if(arr[j+1]<arr[j]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap=true;
				}
				itr++;
			}
			if(!swap) break;
		}
		//System.out.println(itr);
	}
}
