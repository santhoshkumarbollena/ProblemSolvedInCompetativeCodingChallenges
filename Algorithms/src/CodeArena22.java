import java.util.*;
public class CodeArena22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ai=new ArrayList<Integer>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			int count=0;
			int rodl=sc.nextInt();
			if(rodl%2==0) {
				ai.add(0);
			}
			else {
				count++;
				while(rodl>=1) {
					rodl=rodl/2;
					String s=rodl+"";
					int l=1;
					for(int k=0;k<s.length();k++) {
						char c=s.charAt(k);
						if(c=='0') {
							rodl=rodl-l;
						}
						else {
							l=l*10;
						}
					}
					if(rodl%2==0||rodl==1) {
						ai.add(count);
						break;
					}
					
					else {
						count++;
					}
				}
			}
		}
		for(int i=0;i<ai.size();i++) {
			System.out.println(ai.get(i));
		}
		System.out.println(9/2);
	}

}
