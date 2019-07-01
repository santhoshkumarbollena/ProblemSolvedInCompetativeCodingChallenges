import java.util.*;
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ai=new ArrayList<>();
		int size=sc.nextInt();
		int time=sc.nextInt();
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			ai.add(sc.nextInt());
		}
		int count=0;
		for(int i=0;i<ai.size()-time;i=i++){
			int temp=ai.get(i);
			for(int j=0;j<time;j++) {
				temp=temp+ai.get(i+j+1);	
				if(temp>size) {
					count++;
					i=i+j;
				}
			}
			
		}
		int temp=0;
		for(int i=ai.size()-time;i<ai.size();i++) {
			temp=temp+ai.get(i);
			
		}
		if(temp>size) {
			count++;
		}
		System.out.println(count);

	}

}
