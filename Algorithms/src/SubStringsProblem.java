import java.util.*;
public class SubStringsProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ai=new ArrayList<>();
		ArrayList<String> res=new ArrayList<>();
		ai.add("123");
		ai.add("456");
		ai.add("890");
		ai.add("890");
		String str="123456789";
		int jj=0;
		int kk=0;
		int ii=0;
		for(int i=ii;i<ai.size();i++) {
			
			for(int j=jj;j<3;j++) {
				String ss=ai.get(i).charAt(j)+"";
				for(int k=i;k<ai.size()-1;k++) {
					ss=ss+ai.get(k+1).charAt(j)+"";
				}
				res.add(ss);
			}
			jj++;
		}
		System.out.println(res);
	}

}

