import java.util.*;
public class CodeArena32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ai1=new ArrayList<>();
		ArrayList<String> ai2=new ArrayList<>();
		ArrayList<String> res=new ArrayList<>();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			ai1.add(sc.next());
			ai2.add(sc.next());
		}
		for(int i=0;i<ai1.size();i++) {
			String s1=ai1.get(i);
			String s2=ai2.get(i);
			String temp="";
			for(int j=s1.length()-2,k=1;j>0&&k<s2.length();j--,k++) {
				if(!s1.substring(j,s1.length()).equals(s2.substring(0,k))) {
					temp=s1.substring(j,s1.length());
				}
			}
			String demo=s1+s2.substring(temp.length());
			res.add(demo);
		}
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}

	}

}
