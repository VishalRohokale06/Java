class Demo{
	public static void main(String[] args){
		int arr[][] = {{1,4},{4,5}};
		merge(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
	}

	static void merge(int arr[][],int start,int end){
		int n1 = arr[start].length;
		int n2 = arr[start+1].length;

		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];

		for(int i=start;i<n1;i++){
			for(int j=0;j<arr[i].length;j++){
			leftArr[i]=arr[i][j];
			}
		}

		for(int i=start+1;i<n2;i++){
                        for(int j=0;j<arr[i].length;j++){
                         rightArr[i]=arr[i][j];
                        }
                }

		int i=0;
		int j=0;
		int k=0;
		int l=0;

		while(i<n1 && j<n2){
			if(leftArr[i]==rightArr[j]){
				i++;
				j++;
			}else if(leftArr[i]<rightArr[j]){
				arr[k][l]=leftArr[i];
				i++;
				j++;
			}else{
				arr[k][l]=rightArr[j];
				i++;
				j++;
			}
			k++;l++;
		}
	}
}

