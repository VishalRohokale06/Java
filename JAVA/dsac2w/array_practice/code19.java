class Demo{
	public static void main(String[] args){

		int arr[] = {1,3,2,1,4,1,3,2};

		int max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max) max=arr[i];
		}

		int freq[] = new int[max+1];

		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}

		for(int i=0;i<=max;i++){
			if(freq[i]>0){
				System.out.println(freq[i]);
			}
		}
	}
}
