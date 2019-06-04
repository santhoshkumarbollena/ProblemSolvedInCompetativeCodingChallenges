import java.util.*;
public class CodeArena6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        boolean t=false;
        boolean ti=false;
		int n=sc.nextInt();
		int a[]=new int[n];
		int yesc=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(a[i]%2==0) {
				yesc=yesc+a[i];
			}
			else {
			    t=true;
				yesc=yesc+a[i];
			}
		}
		
		if(!t) {
			System.out.println(":(");
			ti=true;
		}
		if(yesc!=0&&!ti) {
		System.out.println(yesc);
		}

	}

}
