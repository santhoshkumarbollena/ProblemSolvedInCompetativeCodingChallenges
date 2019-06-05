import java.math.BigInteger;
import java.util.*;
public class CodeArena16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<BigInteger> ai=new ArrayList<>();
		BigInteger bi=new BigInteger(sc.next());
		
		for(int i=0;i<bi.intValue();i++) {
			ai.add(new BigInteger(sc.next()));
		}
		BigInteger temp=new BigInteger(ai.get(0)+"");
		double s=(Math.pow(10, 9)+7);
		String ss="";
		for(int i=1;i<ai.size();i++) {
			
			temp=temp.multiply(ai.get(i));
			ss=(int)(temp.doubleValue()%s)+"";
			temp=new BigInteger(ss);
		}
		System.out.println((int)(temp.longValue()));

	}

}
