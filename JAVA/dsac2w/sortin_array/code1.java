class Demo{
	public static void main(String[] args){

		int n1[] = {0};
		int n2[] = {1};
		int n3[] = new int[n1.length + n2.length];

		mergeSort(n1,n2,n3);

		for(int i=0;i<n1.length + n2.length;i++){
			System.out.println(n3[i]);
		}
	}

	static void mergeSort(int n1[],int n2[],int n3[]){
		int i=0;
		int j=0;
		int k=0;

		while(i<n1.length && j<n2.length){
			if(n1[i]<n2[j]){
				n3[k]=n1[i];
				i++;
			}else{
				n3[k]=n2[j];
				j++;
			}
			k++;
		}

		while(i<n1.length){
			n3[k]=n1[i];
                        i++;
			k++;
		}

		 while(j<n2.length){
                        n3[k]=n2[j];
                        j++;
                        k++;
                }
	}

}

