import java.util.*;
public class CodeArena12 {
	static int gcd(int a, int b) 
    { 
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
        if (a == b) 
            return a; 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ai=new ArrayList<>();
		ArrayList<Integer> gcd1a=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ai.add(sc.nextInt());
		}
		int prod=1;
		for(int i=0;i<ai.size();i++) {
			prod=prod*ai.get(i);
		}
		int gcd1=0;
		Collections.sort(ai);
		gcd1=gcd(ai.get(0),ai.get(1));
		for(int i=2;i<ai.size();i++) {
			gcd1=gcd(gcd1,ai.get(i));
		}
			 for(int j=1; j <= ai.get(0) && j <= ai.get(ai.size()-1); ++j)
			    {
			        if(ai.get(0)%j==0 &&  ai.get(ai.size()-1)%j==0)
			            gcd1=j;
			    }
		if(ai.size()>2) {
			gcd1=gcd(gcd1,ai.get(ai.size()-1));
		}
		if(n==1) {
			System.out.println(ai.get(0));
		}
		
		System.out.println((int)(Math.pow(prod, gcd1))%(int)(Math.pow(10,9)+7));
		
	}
     

}
