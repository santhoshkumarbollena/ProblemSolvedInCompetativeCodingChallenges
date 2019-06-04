import java.util.*;
public class HotelProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		do {
		String in=sc.next();
		int rooms=sc.nextInt();
		int ter=sc.nextInt();
		logic(in,rooms);
		if(ter==0){
			break;
		}
		}
		while(true);
		

	}
	public static void logic(String inp,int rooms) {
		
		Stack<String> st=new Stack<>();
		String strs[]= new String[inp.length()];
		for(int i=0;i<inp.length();i++) {
			String s=inp.substring(i,i+1);
			strs[i]=s;
		}
		for(int i=0;i<rooms;i++) {
			st.push(strs[i]);
		}
		int count=0;
		for(int i=rooms;i<strs.length;i++) {
			
			for(int j=0;j<st.size();j++) {
				String temp=st.pop();
				if(strs[i].equals(temp)) {
					
				}
				else {
					count++;
					st.push(temp);
				}
			}
			
		}
		System.out.println(count/(count/2));
		
	}

}
