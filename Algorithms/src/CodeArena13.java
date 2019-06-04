import java.util.*;
public class CodeArena13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        ArrayList<Integer> ai=new ArrayList<>();
        String n1=System.console().readLine();
        int n=Integer.parseInt(n1);
        String t12[]=System.console().readLine().split(" ");
        for(int i=0;i<n;i++){
        	int t=Integer.parseInt(t12[i]);
        	if(!ai.contains(t))
            ai.add(t);
        }
        Collections.sort(ai);
        System.out.println(ai);
        int sum=0;
        for(int i=1;i<ai.size();i++){
            sum+=i;
        }
        System.out.println(sum);

	}

}
