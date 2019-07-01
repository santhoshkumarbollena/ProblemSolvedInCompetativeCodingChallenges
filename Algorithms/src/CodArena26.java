import java.util.*;
public class CodArena26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ai=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int b=sc.nextInt();
			int count=0;
			for(int j=1;j<=b;j++) {
				if(b%j==0) {
					count++;
				}
			}
			if(count<4) {
				ai.add("No");
			}
			else {
				ai.add("Yes");
			}
		}
		for(int i=0;i<ai.size();i++) {
			System.out.println(ai.get(i));
		}

	}

}
