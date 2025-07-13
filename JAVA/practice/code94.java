import java.util.*;

class Demo{
	public static void main(String[] args){
		int arr[]= {4,2,3,1,5};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void selection(int arr[]){
		for(int i=0;i<arr.length;i++){
		int last = arr.length-i-1;
		int maxIndex = getMax(arr,0,last);
		swap(arr,last,maxIndex);
		}
	}
	static int getMax(int arr[],int start,int last){
		int max = start;
		for(int i=start;i<=last;i++){
			if(arr[i]>arr[max]){
				max=i;
			}
		}
		return max;
	}

	static void swap(int arr[],int last,int max){
		int temp = arr[last];
		arr[last] = arr[max];
		arr[max] = temp;
	}
}
