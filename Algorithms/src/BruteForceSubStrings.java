import java.util.*;
public class BruteForceSubStrings {
	public static void main(String[] args) {
		BruteForceSubStrings obj=new BruteForceSubStrings();
		int n=obj.lengthOfLongestSubstring("abccbadfef");
		System.out.println(n);
	}
    public int lengthOfLongestSubstring(String s) {
    	int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
    

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
        	System.out.print(s.substring(start,end)+" ");
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        System.out.println();
        return true;
    }
}
