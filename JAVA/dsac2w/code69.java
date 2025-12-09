class Demo{
	public static void main(String[] args){

		int arr[] = {11,22,11,32,13,54};

		arrayE(arr,0);
	}

	static void arrayE(int arr[],int i){
		if(i==arr.length) return;
		System.out.println(arr[i]);
		arrayE(arr,++i);
	}
}
