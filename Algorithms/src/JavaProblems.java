import java.math.BigInteger;
import java.util.*;
public class JavaProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ai=new ArrayList<>();
		ArrayList<Integer> res=new ArrayList<>();
		ArrayList<BigInteger> ql=new ArrayList<>();
		ArrayList<BigInteger> qr=new ArrayList<>();
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			int N=sc.nextInt();
			for(int j=0;j<N;j++) {
				ai.add(sc.nextInt());
			}
			int Q=sc.nextInt();
			for(int j=0;j<Q;j++) {
				ql.add(new BigInteger(sc.next()));
			}
			for(int j=0;j<Q;j++) {
				qr.add(new BigInteger(sc.next()));
			}
			//BigInteger sum=new BigInteger("0");
			int sum=0;
			for(int j=0;j<Q;j++) {
				sum=0;
				int li=ql.get(j).intValue();
				int ri=qr.get(j).intValue();
				
				for(int k=li;k<=ri;k++) {
					sum=sum+ai.get((k-1)%N);
					
				}
				res.add(sum);
			}
		}
		
		for(int i=0;i<res.size();i++) {
			int j=res.get(i);
			System.out.print(res.get(i)%(int)(Math.pow(10, 9)+7)+" ");
		}
	}

}
