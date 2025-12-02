class Demo{
	public static void main(String[] args){

		int arr[] = {7,2,5,1,9,3};

		int prefMin[] = new int[arr.length];
		prefMin[0] = arr[0];

		for(int i=1;i<arr.length;i++){
			if(prefMin[i-1]<arr[i]){
				prefMin[i]=prefMin[i-1];
			}else{
				prefMin[i]=arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
                        System.out.println(prefMin[i]);
                }
	}
}
