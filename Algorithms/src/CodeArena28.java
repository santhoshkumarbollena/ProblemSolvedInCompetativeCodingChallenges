import java.util.*;
public class CodeArena28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ai=new ArrayList<>();
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int numf=sc.nextInt();
			int numw=sc.nextInt();
			ArrayList<ArrayList<Character>> aicc=new ArrayList<>();
			for(int j=0;j<numf;j++) {
				ArrayList<Character> aic=new ArrayList<>();
				for(int k=0;k<numw;k++) {
					aic.add(sc.next().charAt(0));
				}
				aicc.add(aic);
			}
//			for(int l=0;l<aicc.size();l++) {
//				for(int r=0;r<aicc.get(l).size();r++) {
//					if(aicc.get(l).get(r)=='/') {
//						
//					}
//				}
//			}
			int count=0;
			
			for(int l=0;l<aicc.size()-1;l++) {
				//System.out.println(aicc.get(l));
				for(int ll=0;ll<aicc.get(l).size();ll++) {
					String c=Character.toString ((char) 92);
					char cc=c.charAt(0);
					if(aicc.get(l).get(ll)=='/'&&aicc.get(l).get(ll+1)==cc&&aicc.get(l+1).get(ll)==cc&&aicc.get(l+1).get(ll+1)=='/') {
						count++;
					}
				}
			}
			System.out.println(count);
		}

	}

}
