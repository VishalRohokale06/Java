class Demo{
        public static void main(String[] args){

                int arr[] = {2,4,11,21,34,54,63};
                int t = 54;
                System.out.println(bsearch(arr,t,0,arr.length));
        }

        static int bsearch(int arr[],int t,int left,int right){

		if(left>right)
                        return -1;

                int mid = left+((right-left)/2);

                if(arr[mid]==t) return mid;

                if(arr[mid]<t){
                       left = mid+1;
                       return bsearch(arr,t,left,right);
                }else{
                      right = mid-1;
                      return bsearch(arr,t,left,right);
                }

        }
}
