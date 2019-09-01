import java.util.*;
public class CodeArena36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> ai=new ArrayList<Character>();
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(!ai.contains(c)) {
				ai.add(c);
			}
			else {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
