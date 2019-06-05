import java.math.BigInteger;
import java.util.*;
public class CodeArena14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Long> ai1=new ArrayList<Long>();
		ArrayList<Long> ai2=new ArrayList<Long>();
		long max=0;
		BigInteger bi=new BigInteger(sc.next());
		bi.abs();
		//long n=sc.nextLong();
		for(int i=0;i<bi.intValue();i++) {
			long temp=sc.nextLong();
			ai1.add(temp);
		}
		for(int i=0;i<bi.intValue();i++) {
			long temp=sc.nextLong();
			ai2.add(temp);
		}
		long sum1=0;
		long sum2=0;
		for(int i=0;i<bi.intValue()-1;i++) {
			sum1+=Math.abs(ai1.get(i)-ai1.get(i+1));
			max=Math.max(max, Math.abs(ai1.get(i)-ai1.get(i+1)));
		
		}
		for(int i=0;i<bi.intValue()-1;i++) {
			sum2+=Math.abs(ai2.get(i)-ai2.get(i+1));
			max=Math.max(max, Math.abs(ai2.get(i)-ai2.get(i+1)));
		}
		if(sum1>sum2) {
			System.out.println("Dom");
		}
		if(sum1<sum2) {
			System.out.println("Brian");
		}
		if(sum1==sum2) {
			System.out.println("Tie");
		}
		System.out.println(max);

	}

}
