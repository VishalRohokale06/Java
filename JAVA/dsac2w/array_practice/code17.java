class Demo{
	public static void main(String[] args){
		
		int arr[] = {12,35,1,10,34,1};

		int min=arr[0];
		int smin=arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}else if(arr[i]>min && arr[i]<smin)
				smin=arr[i];

		}
		System.out.println(smin);
	}
}
