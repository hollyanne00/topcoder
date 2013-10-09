public class WolfDelaymaster {
	public String check(String str) {
		
		if(str.length()%4!= 0) { return "INVALID"; }
		
		
		int numW = 0;
		int i = 0;
		while(i < str.length()){
			i = checkString(str, i);
			if(i==-1) { return "INVALID"; }
		}
		
		return "VALID";
		
		
	}
	
	public int checkString(String str, int i){
		int numW = 0;
		while(i<str.length()&&str.charAt(i)=='w'){
			numW++;
			i++;
		}
		int lim = i+numW;
		while(i<lim){
			if(i>=str.length()||str.charAt(i)!='o') { return -1; }
			i++;
		}
		lim = i + numW;
		while(i<lim){
			if(i>=str.length()||str.charAt(i)!='l') { return -1; }
			i++;
		}
		lim = i + numW;
		while(i<lim){
			if(i>=str.length()||str.charAt(i)!='f') { return -1; }
			i++;
		}
		return i;
	}
}