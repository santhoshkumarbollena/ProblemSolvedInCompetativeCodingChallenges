import java.util.*;
public class COdeArena11 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		ArrayList<point12> corner=new ArrayList<>();
		ArrayList<Integer> ai=new ArrayList<>();
		int size=sc.nextInt();
		point12 c1=new point12();c1.x=1;c1.y=1;
		point12 c2=new point12();c2.x=1;c2.y=size;
		point12 c3=new point12();c3.x=size;c3.y=1;
		point12 c4=new point12();c4.x=size;c4.y=size;
		corner.add(c1);
		corner.add(c2);
		corner.add(c3);
		corner.add(c4);
		int nos=sc.nextInt();
		for(int i=0;i<nos;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			point12 newp=new point12();newp.x=x;newp.y=y;
			min=Integer.MAX_VALUE;
			for(int j=0;j<4;j++) {
				int xd=Math.abs(newp.x-corner.get(j).x);
				int yd=Math.abs(newp.y-corner.get(j).y);
				int temp=xd+yd;
				if(min>temp) {
					min=temp;
				}
			}
			ai.add(min);
			
		}
		int sum=0;
		for(int i=0;i<ai.size();i++) {
			sum=sum+ai.get(i);
		}
		System.out.println(sum);
	}

}
class point12{
	int x;
	int y;
}
