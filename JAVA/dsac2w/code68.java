class Demo{
        public static void main(String[] args){

                int arr[] = {11,12,31,41,5};
		int min = Integer.MAX_VALUE;

                System.out.println(minE(arr,min,0));
        }

        static int minE(int arr[],int min,int i){

		if(i==arr.length) return min;
		//if(arr[i]<min) min=arr[i];
		return minE(arr,arr[i]<min?arr[i]:min,++i);
		/*for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;*/
        }
}
