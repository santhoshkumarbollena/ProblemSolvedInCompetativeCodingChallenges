import java.util.*;
public class CodeArena27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> res=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			boolean equal=false;
			int Num=sc.nextInt();
			int count=0;
			ArrayList<Integer> ai=new ArrayList<>();
			for(int j=0;j<Num;j++) {
				ai.add(sc.nextInt());
			}
			Collections.sort(ai);
			for(int j=0;j<ai.size()-1;j++) {
				if(ai.get(j)<ai.get(j+1)) {
					
				}
				else if(ai.get(j)==ai.get(j+1)) {
					count++;	
				}
				
			}
			count++;
			res.add(count);
		}
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
	}

}
