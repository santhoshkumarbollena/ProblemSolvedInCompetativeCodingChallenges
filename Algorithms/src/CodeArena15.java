import java.util.*;
public class CodeArena15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		ArrayList<Integer> resi=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ArrayList<Integer> ai=new ArrayList<>();
			ArrayList<Integer> dif=new ArrayList<>();
			int len=sc.nextInt();
			int k=sc.nextInt();
			for(int j=0;j<len;j++) {
				ai.add(sc.nextInt());
			}
			for(int j=0;j<ai.size()-1;j++) {
				dif.add((ai.get(j+1)-ai.get(j)));
			}
			res.add(dif);
			int ress=0;
			boolean f=false;
//			for(int m=0;m<=dif.size()-k;m++) {
//				ress+=dif.get(m);
//				if(m==1) {
//					f=true;
//				}
//			}
			if(k==1) {
				for(int m=0;m<dif.size();m++) {
					ress+=dif.get(m);
				}
			}
			if(k>1) {
			Collections.sort(dif);
			ress=dif.get((dif.size()-1));
			
			}
			resi.add(ress);
		}
		for(int i=0;i<resi.size();i++) {
		System.out.println(resi.get(i));
		}

	}

}
