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
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ai=new ArrayList<Integer>();
        ArrayList<String> ai2=new ArrayList<String>();
        int numberOfInputs = s.nextInt(); // Reading input from STDIN
         
          for(int i=0;i<numberOfInputs;i++){
              ai.add(s.nextInt());
          }
          
        for(int i=0;i<ai.size()-1;i++){
            for(int j=i+1;j<ai.size();j++){
                String str=ai.get(i)+" "+ai.get(j);
                if(!ai2.contains(str)){
                    ai2.add(str);
                }
            }
        }
        System.out.println(ai2.size());
        // for(int i=0;i<ai2.size();i++){
        //     System.out.println(ai2.get(i));
        // }
        // Write your code here
        

    }
}
