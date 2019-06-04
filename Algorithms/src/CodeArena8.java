
/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class CodeArena8 {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ai=new ArrayList<>();
        ArrayList<String> p1=new ArrayList<>();
         ArrayList<String> p2=new ArrayList<>();
         ArrayList<String> gi=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n-1;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            ai.add(a+" "+b);
            p1.add(a+"");
            p2.add(b+"");
        }
        int g=sc.nextInt();
        for(int i=0;i<g;i++){
        	int c=sc.nextInt();
            gi.add(c+"");
        }
        String re="";
        Collections.sort(gi);
        Here:
        for(int i=0;i<ai.size();i++){
            for(int j=0;j<gi.size();j++){
//            	System.out.println(ai.get(i).substring(p1.get(i).length()+1));
//            	System.out.println(gi.get(j));
            if(ai.get(i).substring(p1.get(i).length()+1).equals(gi.get(j))){
                re=gi.get(j);
                break Here;
            }
            }
        }
        System.out.println(re); 
        
    }
}
