import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Integer> ai=new ArrayList<Integer>();
		
		ArrayList<Integer> aiq=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int q=sc.nextInt();
		System.out.println("enter iqs");
		for(int i=0;i<k;i++) {
			ai.add(sc.nextInt());
		}
		System.out.println("enter days");
		for(int j=0;j<q;j++) {
			aiq.add(sc.nextInt());
		}
		int count=0;
		Collections.sort(ai);
		for(int i=0;i<q;i++) {
		//	Collections.sort(ai);
			
			for(int j=0;j<aiq.get(i);j++) {
				count++;
				int temp=ai.get(0);
				int temp2=ai.get(ai.size()-1);
				ai.remove(0);
				ai.remove(ai.size()-1);
				//System.out.println(ai);
				temp=Math.abs(temp-temp2);
				ai.add(0,temp);
				//System.out.println(ai);
				Collections.sort(ai);
				if(count==aiq.get(i))
				break;
			}
			//System.out.println(ai);
			int sum=0;
			for(int x=0;x<ai.size();x++) {
				sum+=ai.get(x);
			}
			System.out.println(sum);
			
		}
	}

}
