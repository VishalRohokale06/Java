class NrstedFor{
        public static void main(String[]args){

                int row=3;
		int num=1;
                for(int i=1;i<=row;i++){
                        

                        for(int j=1;j<=row;j++){

                                System.out.print(num+"  ");

				num++;

                        }
			num-=(row-(row-1));
			

                        System.out.println();

                }
        }
}
