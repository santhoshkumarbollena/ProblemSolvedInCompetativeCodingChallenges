import java.util.*;
public class CodeArena4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<String> ai=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			ai.add(sc.next());
		}
		int max=0;
		int count=0;
		String name="";
		ArrayList<String> eq=new ArrayList<String>();
		ArrayList<String> eqceq=new ArrayList<String>();
		ArrayList<Integer> eqc=new ArrayList<Integer>();
		for(int i=0;i<ai.size()-1;i++) {
			count=0;
			for(int j=i+1;j<ai.size();j++) {
				if(ai.get(i).equals(ai.get(j))) {
					count++;
				}
			}
			if(count>max) {
				max=count;
				name=ai.get(i);
			}
			if(count==max) {
				eqceq.add(ai.get(i)+count);
				eq.add(ai.get(i));
				eqc.add(count);
			}
			
		}
		//System.out.println(name);
		Collections.sort(eqceq);
		Collections.sort(eqc);
		if(eqc.get(0)>max) {
		if(eqceq.size()>1) {
			
				for(int j=0;j<eq.size();j++) {
				if(eqceq.get(0).substring(0,eq.get(j).length()).equals(eq.get(j))) {
					name=eq.get(j);
				}
				
			}
		}
		}
		
		System.out.println(name);
	}

}
