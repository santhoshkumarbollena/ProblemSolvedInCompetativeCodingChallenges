import java.util.*;
public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Nrange=new ArrayList<>();
		for(int i=0;i<5;i++) {
			Nrange.add(i+1);
		}
		int a[]= {4,3,1,2,5};
		ArrayList<Integer> res=new ArrayList<>();
		int sum=0;
		
		for(int i=0;i<a.length;i++) {
			res.add(a[i]);
			Collections.sort(res);
			sum=Nrange.get(0)+Nrange.get(Nrange.size()-1);
			if(res.size()>1) {
			sum=sum+res.get(0)+1+res.get(res.size()-1)-1;
			}
			for(int j=1;j<res.size()-1;j++) {
				sum=sum+(res.get(j)-1)+(res.get(j)+1);
			}
			System.out.println(sum);
			sum=0;
		}
		
	}

}
