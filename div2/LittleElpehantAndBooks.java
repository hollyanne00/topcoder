public class LittleElephantAndBooks {
	public int getNumber(int[] pages, int number) {
		boolean[] read = new boolean[pages.length];
		int[] minimums = new int[number];
		
		minimums[0] = 0;
		for(int i=1;i<number;i++){
			int j=0;
			int min = 999999;
			int minIndex = 0;
			while(j<read.length){
				if(!read[j]){
					System.out.println("pages["+j+"] "+"("+pages[j]+") not read yet");
					int len = pages[j] + minimums[i-1];
					if(len<min){ min = len; minIndex=j;}
				}
				j++;
			}	
			minimums[i] = min;
			System.out.println("minimums["+i+"] = "+min);
			read[minIndex] = true;
		}
		int min = 999999;
		int minIndex = 0;
		for(int i=0;i<read.length;i++){
			if(!read[i]){
				if(pages[i]<min) { min = pages[i]; minIndex = i;}
			}
		}
		read[minIndex] = true;
		min = 999999;
		for(int i=0;i<read.length;i++){
			if(!read[i]){
				if(pages[i]<min){min = pages[i];}
			}	
		}
		return minimums[number-1]+min;
	}

}