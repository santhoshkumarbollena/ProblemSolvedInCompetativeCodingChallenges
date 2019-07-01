import java.util.*;
public class CodeArena24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ai=new ArrayList<String>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String s1=sc.next();
			String s2=sc.next();
			int moves=sc.nextInt();
			int count=0;
			for(int j=0;j<s1.length();j++) {
				char c1=s1.charAt(j);
				char c2=s2.charAt(j);
				if(c1!=c2) {
					count++;
				}
			}
			if(s1.length()!=s2.length()) {
				ai.add("No");
			}
			else if(count==moves) {
				ai.add("Yes");
				
			}
			else {
				ai.add("No");
			}
		}
		for(int i=0;i<ai.size();i++) {
			System.out.println(ai.get(i));
		}
	}

}
