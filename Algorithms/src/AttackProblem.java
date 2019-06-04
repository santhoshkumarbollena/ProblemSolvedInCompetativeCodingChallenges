import java.util.*;
public class AttackProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet<Integer> set=new HashSet<>();
		int testcases=sc.nextInt();
		
		for(int i=0;i<testcases;i++) {
			int numbuil=sc.nextInt();
			int path=sc.nextInt();
			HashMap<String, String> map=new HashMap<>();
			for(int j=0;j<numbuil;j++) {
				int x=sc.nextInt();
				int y=sc.nextInt();
				int d=sc.nextInt();
				String key=x+" "+y;
				String value=d+"";
				map.put(key, value);
				set.add(x);
				set.add(y);
			}
			int Drop=sc.nextInt();
			int Ammo=sc.nextInt();
			int Hall=sc.nextInt();
			int enemy=0;
			for(int b : set){
				   if(b!=Drop&&b!=Ammo&&b!=Hall) {
					   enemy=b;
				   }
				}
			int d1=Integer.MAX_VALUE;
			if(map.get(Drop+" "+enemy)!=null) {
				 d1=Math.min(d1,Integer.parseInt(map.get(Drop+" "+enemy)) );
			}
			if(map.get(enemy+" "+Drop)!=null){
			 d1=Math.min(d1,Integer.parseInt(map.get(enemy+" "+Drop)));
			}
			int d2=Integer.MAX_VALUE;
			if(map.get(Ammo+" "+enemy)!=null) {
				int  d7=2*Integer.parseInt(map.get(Ammo+" "+enemy));
				d2=Math.min(d2, d7);
			}
			if(map.get(enemy+" "+Ammo)!=null) {
			 int d7=2*Integer.parseInt(map.get(enemy+" "+Ammo));
			 d2=Math.min(d2, d7);
			}
			int d3=Integer.MAX_VALUE;
			if(map.get(enemy+" "+Hall)!=null) {
				
				 int d7=Integer.parseInt(map.get(enemy+" "+Hall));
				 d3=Math.min(d3, d7);
			}
			if(map.get(Hall+" "+enemy)!=null){
			 int d7=Integer.parseInt(map.get(Hall+" "+enemy));
			 d3=Math.min(d3, d7);
			}
			if(d1==0) {
				if(map.get(Drop+" "+Hall)!=null&&map.get(Hall+" "+enemy)!=null) {
					 d1=Integer.parseInt(map.get(Drop+" "+Hall))+Integer.parseInt(map.get(Hall+" "+enemy));
				}
				if(map.get(Hall+" "+Drop)!=null&&map.get(Hall+" "+enemy)!=null) {
					 d1=Integer.parseInt(map.get(Hall+" "+Drop))+Integer.parseInt(map.get(Hall+" "+enemy));
				}
				if(map.get(Drop+" "+Hall)!=null&&map.get(enemy+" "+Hall)!=null) {
					 d1=Integer.parseInt(map.get(Drop+" "+Hall))+Integer.parseInt(map.get(enemy+" "+Hall));
				}
				if(map.get(Hall+" "+Drop)!=null&&map.get(enemy+" "+Hall)!=null) {
					 d1=Integer.parseInt(map.get(Hall+" "+Drop))+Integer.parseInt(map.get(enemy+" "+Hall));
				}
			}
			if(d2==0) {
				if(map.get(enemy+" "+Hall)!=null&&map.get(Hall+" "+Ammo)!=null) {
					 d2=2*Integer.parseInt(map.get(enemy+" "+Hall))+Integer.parseInt(map.get(Hall+" "+Ammo));
				}
				if(map.get(Hall+" "+enemy)!=null&&map.get(Hall+" "+Ammo)!=null) {
					 d2=2*Integer.parseInt(map.get(Hall+" "+enemy))+Integer.parseInt(map.get(Hall+" "+Ammo));
				}
				if(map.get(enemy+" "+Hall)!=null&&map.get(Ammo+" "+Hall)!=null) {
					 d2=2*Integer.parseInt(map.get(enemy+" "+Hall))+Integer.parseInt(map.get(Ammo+" "+Hall));
				}
				if(map.get(Hall+" "+enemy)!=null&&map.get(Hall+" "+Ammo)!=null) {
					 d2=2*Integer.parseInt(map.get(Hall+" "+enemy))+Integer.parseInt(map.get(Hall+" "+Ammo));
				}
			}
			if(d3==0) {
				if(map.get(enemy+" "+Ammo)!=null&&map.get(Ammo+" "+Hall)!=null) {
					 d3=Integer.parseInt(map.get(enemy+" "+Ammo))+Integer.parseInt(map.get(Ammo+" "+Hall));
				}
				if(map.get(Ammo+" "+enemy)!=null&&map.get(Hall+" "+Ammo)!=null) {
					 d3=Integer.parseInt(map.get(Ammo+" "+enemy))+Integer.parseInt(map.get(Hall+" "+Ammo));
				}
				if(map.get(enemy+" "+Ammo)!=null&&map.get(Hall+" "+Ammo)!=null) {
					 d3=Integer.parseInt(map.get(enemy+" "+Ammo))+Integer.parseInt(map.get(Hall+" "+Ammo));
				}
				if(map.get(Ammo+" "+enemy)!=null&&map.get(Ammo+" "+Hall)!=null) {
					 d3=Integer.parseInt(map.get(Ammo+" "+enemy))+Integer.parseInt(map.get(Ammo+" "+Hall));
				}
			}
			System.out.println(d3+d1+d2);
			
		}

	}

}
