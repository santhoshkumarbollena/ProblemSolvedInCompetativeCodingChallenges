import java.util.*;
public class InfosisProb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int weight=4;
		char alp[]= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		ArrayList<Integer> ai=new ArrayList<>();
		ai.add(1);
		for(int i=1;i<26;i++) {
			ai.add(((i+1)*ai.get(i-1))+ai.get(i-1));
		}
		String output="";
		int c=0;
		for(int i=0;i<ai.size();i++) {
			if(weight<ai.get(i)) {
				c=i;
				break;
			}
		}
		//System.out.println(ai);
		//System.out.println(c);
		c=c-1;
		while(weight>1) {
			for(int i=c;i>=0;i--) {
				if(weight>ai.get(i)) {
					weight=weight-ai.get(i);
					output=output+alp[i];
					i++;
				}
			}
		}
		//System.out.println(weight);
		if(weight==1) {
			output=output+"A";
		}
		//System.out.println(output);
		StringBuilder sb=new StringBuilder(output);
		sb.reverse();
		System.out.println(sb);
	}

}
