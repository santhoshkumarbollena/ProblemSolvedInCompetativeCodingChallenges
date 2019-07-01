import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;
public class CodeArena20 {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc=new FastReader();
		int n=sc.nextInt();
		BigInteger bi=new BigInteger(sc.next());
		for(int i=1;i<n;i++) {
			BigInteger bi2=new BigInteger(sc.next());
			bi=bi2.multiply(bi);
		}
		String str=bi.longValue()+"";
		//System.out.println(str);
		int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			char c=str.charAt(i);
			if(c=='0') {
				count++;
			}
			else {
				break;
			}
		}
		System.out.println(count);
	}

}
