public class ColorfulRoad {
	public int getMin(String road){

		int[] opt = new int[road.length()];
		opt[0] = 0; // first step red

		for(int j=1;j<road.length();j++){
			char current = road.charAt(j);
			int min = -1;
			for(int i=0;i<j; i++){
				char c = road.charAt(i);
				int cost = -1;
				if(current=='R'&&c=='B') { 
					if(opt[i]!=-1){
						cost = (j-i)*(j-i) + opt[i];
						if(min==-1||cost<min){ min = cost; }	
					} 	
	
				}
				if(current=='G'&&c=='R') {
					if(opt[i]!=-1){
						cost = (j-i)*(j-i) + opt[i];
						if(min==-1||cost<min){ min = cost; }
					} 
						
				}
				if(current=='B'&&c=='G') { 
					if(opt[i]!=-1){
						cost = (j-i)*(j-i) + opt[i];
						if(min==-1||cost<min){ min = cost; }	

					} 
				}
			}
			opt[j] = min;		
		}

		return opt[opt.length-1];
	}

	public static void main(String[] args){
		ColorfulRoad r = new ColorfulRoad();
		System.out.println(r.getMin("RGBRGBRGB"));
	}
}