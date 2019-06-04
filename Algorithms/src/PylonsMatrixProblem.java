
public class PylonsMatrixProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int j=5;
		int a[][]=new int[i][j];
		for(int row=0;row<i;row++) {
			for(int col=0;col<j;col++) {
				a[row][col]=-1;
			}
		}
		int count =1;
		String ans="POSSIIBLE";
		
		Here:
		for(int mul=1;mul<i*j;mul++) {
			
					if(a[mul][mul]==-1) {
						a[mul][mul]=count;
						count++;
					}
					else {
						ans="IMPOSSIIBLE";
						break Here;
					}
		}
		for(int row=0;row<i;row++) {
			for(int col=0;col<j;col++) {
				System.out.print(a[row][col]);
			}
			System.out.println();
		}
		System.out.println(ans);
		
	}

}
