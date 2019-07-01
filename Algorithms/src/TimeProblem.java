import java.util.*;
public class TimeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> ress=new ArrayList<>();
		ArrayList<Integer> ai=new ArrayList<>();
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			ArrayList<String> tot=new ArrayList<>();
			ArrayList<String> st=new ArrayList<>();
			ArrayList<String> end=new ArrayList<>();
			ArrayList<Integer> stint=new ArrayList<>();
			ArrayList<Integer> endint=new ArrayList<>();
			ArrayList<Integer> res=new ArrayList<>();
			
			
			int num=sc.nextInt();
			for(int j=0;j<num;j++) {
				String s="";
				s=s+sc.next();
				s=s+";"+sc.next();
				tot.add(s);
			}
//			for(int j=0;j<tot.size();j++) {
//				System.out.println(tot.get(j));
//			}
			Collections.sort(tot);
			//System.out.println(tot);
			for(int j=0;j<num;j++) {
				String ss[]=tot.get(j).split(";");
				st.add(ss[0]);
				end.add(ss[1]);
			}
			for(int j=0;j<st.size();j++) {
				String timeSplit[]=st.get(j).split(":");
				int temp=(Integer.parseInt(timeSplit[0])*60*60)+(Integer.parseInt(timeSplit[1])*60)+Integer.parseInt(timeSplit[2]);
				stint.add(temp);
			}
			for(int j=0;j<end.size();j++) {
				String timeSplit[]=end.get(j).split(":");
				int temp=(Integer.parseInt(timeSplit[0])*60*60)+(Integer.parseInt(timeSplit[1])*60)+Integer.parseInt(timeSplit[2]);
				endint.add(temp);
			}
			int sum=0;
			
				for(int k=0;k<num;k++) {
					for(int j=0;j<num;j++) {
//					if(endint.get(k)>stint.get(j)) {
//						stint.remove(j);
//						stint.add(j,endint.get(k));
//					}
					//System.out.println(stint.get(j)/(60*60)+"<"+stint.get(k)/(60*60)+"<"+endint.get(j)/(60*60));
					if(stint.get(k)>stint.get(j)&&stint.get(k)<endint.get(j)) {
						//System.out.println(stint.get(j));
						//System.out.println(endint.get(k));
						stint.remove(k);
						stint.add(k,endint.get(j));
					}
					
				}
				
			}
			for(int j=0;j<num;j++) {
			int demo=Math.abs(stint.get(j)-endint.get(j));
			if((stint.get(j)-endint.get(j))<0&&(sum+demo)<=(24*60*60)){
				sum=sum+demo;
			}
			
			}
			//System.out.println(sum);
			int h=sum/(60*60);
			sum=sum-(h*60*60);
			//System.out.println(sum);
			int m=0;
			if(sum>(60)) {
				m=sum/60;
				sum=sum-(m*60);
				}
			String hh=""+h;
			String mm=""+m;
			String ss=""+sum;
			if(h<=9) {
				hh="0"+hh;
			}
			if(m<=9) {
				mm="0"+mm;
			}
			if(sum<=9) {
				ss="0"+ss;
			}
			
			String s=(hh)+":"+(mm)+":"+ss;
			ress.add(s);
		}
		for(int i=0;i<ress.size();i++) {
			System.out.println(ress.get(i));
		}
	}

}
