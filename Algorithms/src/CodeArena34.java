import java.util.*;
public class CodeArena34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> ai=new ArrayList<>();
		ArrayList<Integer> rowa=new ArrayList<>();
		ArrayList<Integer> cola=new ArrayList<>();
		for(int i=0;i<n;i++) {
			rowa.add(sc.nextInt());
			cola.add(sc.nextInt());
		}
		for(int i=0;i<n;i++) {
			int row=rowa.get(i);
			int col=cola.get(i);
			int a[][]=new int[row][col];
			int b[][]=new int[row][col];
			int c[][]=new int[row][col];
			
			int temp=1;
			for(int k=0;k<row;k++) {
				for(int j=0;j<col;j++) {
					if(col==1) {
						a[k][j]=temp;
						temp++;
					}
					else {
					a[k][j]=temp;
					temp++;
					}
				}
			}
			int temp2=1;
			int temp3=col+1;
			int d=0;
			for(int k=0;k<row;k++) {
				for(int j=0;j<col;j++) {
				if(d%2==0) {
					b[k][j]=temp2;
					temp2++;d++;
				}
				else {
					b[k][j]=temp3;
					temp3++;
				}
				}
			}
			
			for(int k=0;k<row;k++) {
				for(int j=0;j<col;j++) {
					c[k][j]=a[k][j]+b[k][j];
				}
				
			}
			int sum=0;
			for(int k=0;k<row;k++) {
				for(int j=0;j<col;j++) {
					if(k==j) {
						//System.out.println(sum);
						sum=sum+c[k][j];
					}
					
				}
				
			}
			
			ai.add(sum);
		}
		for(int i=0;i<ai.size();i++) {
			System.out.println(ai.get(i));
		}

	}

}
