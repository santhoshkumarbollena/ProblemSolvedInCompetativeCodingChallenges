import java.util.*;
public class CodeArena31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> aih=new ArrayList<>();
		ArrayList<Integer> aih2=new ArrayList<>();
		ArrayList<Integer> aia=new ArrayList<>();
		ArrayList<Integer> res=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int k=sc.nextInt();
			
			for(int m=0;m<k;m++) {
				int t1=sc.nextInt();
				aih.add(t1);
				aih2.add(t1);
				int t2=sc.nextInt();
				aia.add(t2);
			}
			int demo=0;
			Collections.sort(aih);
			int l1=aih.get(aih.size()-1);
			int l2=aih.get(aih.size()-2);
			for(int p=0;p<aih2.size();p++) {
				if(l1==aih2.get(p)) {
					if(l1<aia.get(p)) {
						demo=demo+aia.get(p);
						aia.add(demo);
					}
					aih2.remove(p);
					aia.remove(p);
				}
				
			}
			for(int p=0;p<aih2.size();p++) {
				if(l2==aih2.get(p)) {
					if(l2<aia.get(p)) {
						demo=demo+aia.get(p);
						aia.add(demo);
					}
					aih2.remove(p);
					aia.remove(p);
				}
				
			}
			int sum=l1+l2;
			//System.out.println(l1+"  "+l2);
			for(int p=0;p<aia.size();p++) {
				sum=sum-aia.get(p)-demo;
			}
			res.add(sum);
		}
		for(int k=0;k<res.size();k++) {
			System.out.println(res.get(k));
		}

	}

}
