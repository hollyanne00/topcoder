public class RaiseThisBarn {
	public int calc(String str) {
	
		int numSections = str.length();
		int numCows = 0;
		
		for(int i=0; i<str.length();i++){
			if (str.charAt(i) == 'c') { numCows++; }
		}
		
		if(numCows==0) { return str.length() - 1; }
		if((numCows%2)==1){ return 0; } //odd number of cows
		
		int maxCows = numCows/2;
		int k = 0;
		int possK = 0;
		int i=0;
		while(k <= maxCows) {
			if(str.charAt(i)=='c'){ k++; }
			else if(k==maxCows) { possK++; }
			i++;
		}
		
		return possK+1;
	}

}