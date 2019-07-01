import java.util.*;
public class CodeArena23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ai=new ArrayList<Integer>();
		int n=sc.nextInt();
		ArrayList<Long> maxai=new ArrayList<>();
		ArrayList<Long> countai=new ArrayList<>();
		for(int i=0;i<n;i++){
			long size=sc.nextLong();
			
			long max=0;
			long count=0;
			for(int j=0;j<size;j++) {
				for(int k=0;k<size;k++) {
					int temp=j^k;
					if(temp>max) {
						max=temp;
						count=0;
					}
					if(temp==max) {
						count=count+1;
					}
				}
			
			}
			maxai.add(max);
			countai.add(count);
		}
		for(int i=0;i<maxai.size();i++) {
			System.out.println(maxai.get(i)+" "+countai.get(i));
		}
	}

}
