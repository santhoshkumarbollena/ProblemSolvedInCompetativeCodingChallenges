import java.util.*;
public class CodeArena37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Character> ai1=new ArrayList<>();
		ArrayList<Character> ai2=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ai1.add(sc.next().charAt(0));
			ai2.add(sc.next().charAt(0));
		}
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<n;j++) {
				if(ai1.get(j)==s.charAt(i)) {
					s=s.substring(0,i)+ai2.get(j)+s.substring(i+1);
				}
				else if(ai2.get(j)==s.charAt(i)) {
					s=s.substring(0,i)+ai1.get(j)+s.substring(i+1);
				}
				
			}
		}
		
		System.out.println(s);
	}

}
