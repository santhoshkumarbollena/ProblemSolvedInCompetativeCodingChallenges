import java.util.*;
public class HighestRepeatedCharecters  
{ 
    static final int ASCII_SIZE = 256; 
    static char getMaxOccuringChar(String str) 
    { 
        // Create array to keep the count of individual 
        // characters and initialize the array as 0 
        int count[] = new int[ASCII_SIZE]; 
       
        // Construct character count array from the input 
        // string. 
        int len = str.length(); 
        for (int i=0; i<len; i++) 
            count[str.charAt(i)]++; 
       
        int max = -1;  // Initialize max count 
        char result = ' ';   // Initialize result 
        
        for (int i = 0; i < len; i++) { 
            if (max < count[str.charAt(i)]) { 
                max = count[str.charAt(i)]; 
                result = str.charAt(i); 
            } 
        } 
       
        return result; 
    } 
      
    // Driver Method 
    public static void main(String[] args) 
    { 
       Scanner sc=new Scanner(System.in); 
       String str=sc.next();
        System.out.println("" + getMaxOccuringChar(str)); 
       System.out.println(countFre(str));
    } 
    public static char countFre(String S)
    {
    	int max=0;
    	char maxc=' ';
        for(char c = 'a';c <= 'z';++c)//char c = 'a';c <= 'z';++c
        {
            int frequency = 0;
            for(int i = 0;i < S.length();++i)//int i = 0;i < S.length();++i
                if(S.charAt(i) == c)
                    frequency++;
            
            if(max<frequency) {
            	max=frequency;
            	maxc=c;
            }
          // System.out.println(c+" "+frequency);
    
        }
        return maxc;
    }
} 
