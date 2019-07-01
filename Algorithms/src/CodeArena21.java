import java.util.*;
public class CodeArena21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> badd=new ArrayList<>();
		ArrayList<Integer> goodd=new ArrayList<>();
		int bad=0;
		int good=0;
		int prime[]= {2,3,5,7,11,13,17,23};
		for(int i=0;i<n;i++) {
			bad=0;
			good=0;
			int h=sc.nextInt();
			int m=sc.nextInt();
			int s=sc.nextInt();
			for(int hh=h;hh<24;hh++) {
				for(int mm=m;mm<=59;mm++) {
					for(int ss=s;ss<=59;ss++) {
						for(int k=0;k<prime.length;k++) {
							if(hh%prime[k]==0&&mm%prime[k]==0&&ss%prime[k]==0) {
								bad++;	
							}
						}
					}
				}
			}
			//System.out.println(good+" "+bad);
			int dh=(23-h)*60*60;
			int dm=(59-m)*60;
			int ds=(59-s);
			good=dh+dm+ds+1-bad;
			while(bad>1) {
				
				good=good/bad;
				bad=bad/bad;
			}
			badd.add(bad);
			goodd.add(good);
			
		}
		for(int i=0;i<badd.size();i++) {
			System.out.println(badd.get(i)+":"+goodd.get(i));
		}
	}

}
