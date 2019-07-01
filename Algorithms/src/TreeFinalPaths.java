import java.util.*;
public class TreeFinalPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int root=2;
		ArrayList<Integer> aai=new ArrayList<>();
		ArrayList<Integer> bai=new ArrayList<>();
		ArrayList<String> res=new ArrayList<>();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			aai.add(a);
			bai.add(b);
		}
		//To get the root of the tree
		for(int i=0;i<aai.size();i++) {
			if(!bai.contains(aai.get(i))){
				root=aai.get(i);
			}
		}
		//Add all the possible paths for the tree
		for(int i=0;i<aai.size();i++) {
			if(aai.get(i)==root) {
				res.add(aai.get(i)+" "+bai.get(i)+"");
			}
			for(int j=0;j<res.size();j++) {
				String demo[]=res.get(j).split(" ");
			if(aai.get(i)==Integer.parseInt(demo[demo.length-1])) {
				res.add(res.get(j)+" "+bai.get(i));
			}
			}
		}
		//Printing all the paths
		for(int i=0;i<res.size();i++) {
			System.out.println(res.get(i));
		}
	}

}
