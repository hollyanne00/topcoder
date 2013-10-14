import java.util.*;

public class GooseTattarrattatDiv2 {
	
	public int getmin(String s){
	
		Map<Character, Integer> letterCounts = new HashMap<Character, Integer>();
		for(int i=0;i<s.length();i++){
			char x = s.charAt(i);
			if(letterCounts.containsKey(x)){
				letterCounts.put(x, letterCounts.get(x)+1);
			} else {
				letterCounts.put(x, 1);
			}
		}

		Set<Character> letters = letterCounts.keySet();
		int max = 0;
		int total = 0;
		for(char c : letters){
			int num = letterCounts.get(c);
			total += num;
			if(num>max){ max = num};
		}

		return total - max;
	}

}