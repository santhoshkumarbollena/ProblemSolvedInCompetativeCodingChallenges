import java.util.ArrayList;
import java.util.Scanner;
public class CipherDecipherCodeArena10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ai=new ArrayList<>();
		
//		for(int i=97;i<123;i++) {
//			ROT.add((char)i);
//		}
		
		//System.out.println(ROT);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			ai.add(sc.next());
		}
		int count=0;
		for(int i=0;i<n;i++) {
			ArrayList<Character> ROT=new ArrayList<>();
			ArrayList<Character> ci=new ArrayList<>();
			ArrayList<Integer> cou=new ArrayList<Integer>();
			for(int j=0;j<ai.get(i).length();j++) {
				if(!ci.contains(ai.get(i).charAt(j))){
					ci.add(ai.get(i).charAt(j));
					cou.add(count);
					if((int)ai.get(i).charAt(j)<110) {
					ROT.add((char)(((int)ai.get(i).charAt(j)+13)));
					}
					else {
						ROT.add((char)(((int)ai.get(i).charAt(j)-13)));
					}
					
				}
				else {
					for(int k=0;k<j;k++) {
						if(ai.get(i).charAt(j)==ci.get(k)) {
							count++;
						}
					}
					//System.out.println("exe");
					ci.add(ai.get(i).charAt(j));
					if((int)ai.get(i).charAt(j)<110) {
						ROT.add((char)(((int)ai.get(i).charAt(j)+13+count)));
						}
						else {
							ROT.add((char)(((int)ai.get(i).charAt(j)-13+count)));
						}
					cou.add(count);
					count=0;
				}
			}
			//System.out.println(ci);
			//System.out.println(cou);
			//System.out.println(ROT);
			String decipher="";
			for(int m=0;m<ROT.size();m++) {
				decipher=decipher+ROT.get(m);
			}
			System.out.println(decipher);
		}
//		for(int i=0;i<n;i++) {
//			String decipher="";
//			int st=13;
//			int count=0;
//			ArrayList<Character> ci=new ArrayList<>();
//			for(int j=0;j<ai.get(i).length();j++) {
//			ci.add(ai.get(i).charAt(j));
//			}
//			
//			for(int k=0;k<ci.size();k++) {
//				count=0;
//				for(int f=k+1;f<ci.size();f++) {
//					if(ci.get(k)==ci.get(f)) {
//						count++;
//					}
//					
//				}
//				
//				int t=((((int)ci.get(k))+st+count));
//				if((int)ci.get(k)>=110) {
//					t=(int)ci.get(k)-st+count;
//				}
//				decipher=decipher+(char)(t);
//				
//			}
//			System.out.println(decipher);
//		}

	}

}
