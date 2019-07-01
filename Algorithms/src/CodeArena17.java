import java.math.BigInteger;
import java.util.*;
public class CodeArena17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> res=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ArrayList<Integer> ai=new ArrayList<>();
			
			ArrayList<String> aipns=new ArrayList<>();
			
			ArrayList<String> aipqs=new ArrayList<>();

			int N=sc.nextInt();
			int q=sc.nextInt();
			for(int j=0;j<N;j++) {
				
				int x=sc.nextInt();
				int y=sc.nextInt();
				
				aipns.add(x+" "+y);
				
				
			}
			
			for(int j=0;j<q;j++) {
			
				int x=sc.nextInt();
				int y=sc.nextInt();
			
				aipqs.add(x+" "+y);
			}
			System.out.println(aipns);
		}
	}
	
}
 class Tree<T> {
    private Node<T> root;

    public Tree(T rootData) {
        root = new Node<T>();
        root.data = rootData;
        root.children = new ArrayList<Node<T>>();
    }

    public static class Node<T> {
        private T data;
        private Node<T> parent;
        private List<Node<T>> children;
    }
}
