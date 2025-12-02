class Demo{
	public static void main(String[] args){

		int arr[] = {0,0,4,0,7};

		int in=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[in++]=arr[i];
			}
		}

		while(in<arr.length){
			arr[in++]=0;
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
