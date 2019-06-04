import java.util.*;
public class CodeArena7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		ArrayList<Integer> ai=new ArrayList<>();
		ArrayList<Integer> ai2=new ArrayList<>();
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				for(int k=j+1;k<a.length;k++) {
					ai.add(a[i]^a[j]^a[k]);
				}
			}
		}
		
		Math.pow(1, 2);
		int sum=ai.get(0);
		for(int i=1;i<ai.size();i++) {
			sum=sum|ai.get(i);
		}
		System.out.println(sum);
		

	}

}
