class Demo{
	static int count = 0;
	public static void main(String[] args){
		
		int arr[] = {11,12,13,19,54,76};
		
		bubbleSort(arr);

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	static void bubbleSort(int arr[]){
		boolean swaped = false;
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[i];
					arr[i] = arr[j+1];
					arr[j+1] = temp;
					swaped=true;
				}
			}
			System.out.println(++count);
			if(!swaped) break;
		}
	}

}
