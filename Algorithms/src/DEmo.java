import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class DEmo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            int N = Integer.parseInt(br.readLine().trim());
            String[] arr_A = br.readLine().split(" ");
            long[] A = new long[N];
            for(int i_A=0; i_A<arr_A.length; i_A++)
            {
            	A[i_A] = Long.parseLong(arr_A[i_A]);
            }
            int Q = Integer.parseInt(br.readLine().trim());
            String[] arr_L = br.readLine().split(" ");
            long[] L = new long[Q];
            for(int i_L=0; i_L<arr_L.length; i_L++)
            {
            	L[i_L] = Long.parseLong(arr_L[i_L]);
            }
            String[] arr_R = br.readLine().split(" ");
            long[] R = new long[Q];
            for(int i_R=0; i_R<arr_R.length; i_R++)
            {
            	R[i_R] = Long.parseLong(arr_R[i_R]);
            }

            ArrayList<BigInteger> out_ = solve(A, R, L);
            System.out.print(out_.get(0));
            for(int i_out_=1; i_out_<out_.size(); i_out_++)
            {
            	System.out.print(" " + out_.get(i_out_));
            }
            System.out.println("");
         }

         wr.close();
         br.close();
    }
    static ArrayList<BigInteger> solve(long[] A, long[] R, long[] L){
        // write your code here
        long sum=0;
        ArrayList<BigInteger> ai=new ArrayList<>();
        long out[]=new long[R.length];
			for(int i=0;i<L.length;i++) {
				sum=0;
				long li=L[i];
				long ri=R[i];
				
				for(long k=li;k<=ri;k++) {
					sum=sum+A[(int) ((k-1)%A.length)];
					
				}
				out[i]=(sum%(int)(Math.pow(10, 9)+7));
				ai.add(new BigInteger(out[i]+""));
			}
        return ai;
    }
}