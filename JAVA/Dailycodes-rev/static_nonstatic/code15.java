import java.io.*;

class InputDemo{
        public static void main(String[] args)throws IOException{

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                String name = br.readLine();
		int fltNo = Integer.parseInt(br.readLine());
                char wing = (char)br.read();
		//int age = Integer.parseInt(br.readLine());


                System.out.println(name);
                System.out.println(wing);
		System.out.println(fltNo);
        }
}
