import java.util.*;
public class InfosysProb2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int limit=10;
		int n=sc.nextInt();
		ArrayList<Integer> ai=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ai.add(sc.nextInt());
		}
		limit=sc.nextInt();
		Collections.sort(ai);
		//System.out.println(ai);
		int output=0;
		for(int i=(ai.size()-1);i>=0;i--) {
			if(ai.get(i)<=limit) {
				limit=limit-ai.get(i);
				output=output+ai.get(i);
			}
		}
	
		System.out.println(output);
	}

}
