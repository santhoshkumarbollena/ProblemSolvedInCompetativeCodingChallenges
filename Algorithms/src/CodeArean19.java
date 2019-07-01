import java.math.BigInteger;
import java.util.*;
public class CodeArean19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> ai=new ArrayList<>();
		ArrayList<BigInteger> aib=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String a=sc.next();
			String b=sc.next();
			String c=sc.next();
			BigInteger bai=new BigInteger(a);
			BigInteger bbi=new BigInteger(b);
			BigInteger bci=new BigInteger(c);
			BigInteger sum=bai.add(bbi.add(bci));
			//System.out.println(s);
			if(aib.contains(sum)) {
				aib.remove(sum);
			}
			else {
			aib.add(sum);
			}
		}
		System.out.println(aib.size());
	}

}
