import java.util.*;
public class CodeArena29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> level=new ArrayList<>();
		ArrayList<Integer> ai=new ArrayList<>();
		int n=sc.nextInt();
		int l=1;
		int x=3;
		for(int i=0;i<n;i++){
			level.add(l);
			l=l+x;
			x=x+2;
		}
		for(int i=0;i<n;i++) {
			ai.add(sc.nextInt());
		}
//		for(int i=0;i<ai.size();i++) {
//			for(int j=0;j<level.size();j++) {
//				if(level.get(j)==(ai.get(i))) {
//					level.remove(j);
//					ai.remove(i);
//				}
//			}
//		}
		//System.out.println(level);
		//System.out.println(ai);
		int sum=0;
		for(int i=0;i<ai.size();i++) {
			sum=sum+Math.abs(ai.get(i)-level.get(i));
		}
		System.out.println(sum);
	}

}
