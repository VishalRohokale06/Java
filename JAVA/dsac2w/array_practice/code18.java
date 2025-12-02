class Demo{
        public static void main(String[] args){

                int arr[] = {12,35,1,10,34,1};

                int max=arr[0];
                int smax=arr[0];

                for(int i=0;i<arr.length;i++){
                        if(arr[i]>max){
                                max=arr[i];
                        }else if(arr[i]<max && arr[i]>smax)
                                smax=arr[i];

                }
                System.out.println(smax);
        }
}
