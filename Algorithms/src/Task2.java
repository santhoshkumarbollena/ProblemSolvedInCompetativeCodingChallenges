import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<String> ai=new ArrayList<String>();
		ArrayList<String> strs=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int i=0;i<t*2;i++) {
			ai.add(sc.next());
		}
		int count=0;
		for(int i=0;i<ai.size();i=i+2) {
			
				if(ai.get(i).equals("add")) {
					strs.add(ai.get(i+1));
					
				}
				if(ai.get(i).equals("find")) {
					count=0;
					String st=ai.get(i+1);
					for(int j=0;j<strs.size();j++) {
						if(st.equals(strs.get(j).substring(0, st.length()))) {
							count++;
						}
					}
					System.out.println(count);
				}
		}

	}

}
