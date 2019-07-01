import java.util.*;
public class CodeArena18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> aiA=new ArrayList<>();
		ArrayList<Integer> aiB=new ArrayList<>();
		int N=sc.nextInt();
		int Q=sc.nextInt();
		for(int i=0;i<Q;i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			aiA.add(A);
			aiB.add(B);
			Collections.sort(aiA);
			Collections.sort(aiB);
			if(Q==1) {
				System.out.println("0");
				break;
			}
			else {
				System.out.println(Math.abs(aiA.size()-aiB.size()));
			}
		}

	}

}
