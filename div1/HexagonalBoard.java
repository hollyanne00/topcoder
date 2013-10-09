public class HexagonalBoard {
	
	public int minColors(String[] board){

		int n = board.length;
		boolean noCells = true;
		int minColors = 0;

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int adj = 0;
				if(board[i].charAt(j)=='X'){
					noCells = false;
					if((j-1)>0&&board[i].charAt(j-1)=='X'){ adj++; }
					if((j+1)<n&&board[i].charAt(j+1)=='X'){ adj++; }

					if((i-1)>0&&board[i-1].charAt(j)=='X'){ adj++; }
					if((i-1)>0&&(j+1)<n&&board[i-1].charAt(j+1)=='X'){ adj++; }

					if((i+1)<n&&(j-1)>0&&board[i+1].charAt(j-1)=='X'){ adj++; }
					if((i+1)<n&&board[i+1].charAt(j)=='X'){ adj++; }
				}

				System.out.println("Cell (" + i +", " + j + ") adjacencies: " + adj);

				if(adj > 2){ minColors = 2; break; }
				else if(adj > 0) { minColors = 1; }
				
				
			}
			
			if(minColors==2){ break; }

		}
		
		System.out.println("mincolors: "+minColors+", noCells: "+ noCells);

		if(noCells){ return 0; }
		else { return minColors+1; }

	}

	public static void main(String[] args){
		HexagonalBoard h = new HexagonalBoard();
		String[] board = new String[]{"-X-X--XX-XX-XXXXX-XX-XXX---XX-X-XX-XX--XX-XXXXX--X", "X-X-XX-X--X-----X--XX---XXX-X----XX-X-X-X-----XXX-", "-X-X---X--XXX-X-XX--X--X--XX-XXXX-X-X-XX-X---X--X-", "X-X-XX--XX---X----X--X--X--X-------X----X-XX--X-X-", "X--X-X-X--X-X-X-XX-XX-X-XX--XX-XXX-XX-X-X--X-X--XX", "XXX--X-X--XX--XX--X-XX-X--X--X----X--X--XX-XX-X---", "--XX-XX-X----X--XX---X--XX-X-X-XX-X-X-XX-X---X-XXX", "X--X---X-XXX-XX---XX--XX--X-X---X-X-X--X-X-XX-X--X", "X--XX-X-X--X----XX--X--X-X-X-XX-X-X-XX-X--X-X-XX-X", "X-X-X-X----X-XXX-XX-XXX-X-X-X--X-X-X-XX-X-XX-X-XX-", "XX--X-XXXX--X---X-X---X-----X-X--X-X----X---X-X-XX", "-X--X-----X--XXX-X-X---XX-X-X--X-X-X-XX-XX-X--XX-X", "-XX--X-XX--X---XX--XX-X--X-X-XX--X-------X--XX---X", "X-XX-XX-X-X-XX---X---X-X-X--X-XX-X-XXXXX-XX---XX-X", "XX-X----X-----X-X-XX---XX-X-X--X-X--------X-X--XX-", "----XXXX-X-XX-X-XX--XX---X--XX-X--XX-XXXX-X--XX--X", "XXX----X-X----XX--XX-X-X-XXX--X-XX--X-----X-X-XXX-", "--X-XXX---XX-X-X-X-X--X-----XX-X--X--X-X--XX-X--XX", "XX-X--XXX--X----X--X-X-XX-X---X-XX-X-X-XXX-X--XX-X", "-X-XXX--XX--XX-X-XX-X-X-XX--XX----X-X-X----XXX-X--", "-XX---X--X-X--X-X-XX-X---X-X--X-X-X-X---XX---XX-XX", "X-X-XX-X-XX-X--X----X--X----XX-X-----XX--XXX---X--", "XX---X-XX---X-X-XXX--XX-XXXX---XX-X-X--XX--XX---XX", "-XXX-----XX-X-X---X-X--X-----X--X-X--X--X-X-XX-X--", "X---XXXX---X--X-X-X--XX-XX-XX-X---X-X-X-X-XX--X-X-", "XXXX----XX-XX-----XX--XX--X--X-XX--X-----X--X--X-X", "---X-X-X--X--X-X-X-XXX-XX---X-X--X--XXX--XX--X-X--", "XX--X-X-X--X-XX--X---XX--XX-XX-XX-X---XX--X-X-X-XX", "--X-X-X--XX-X-X-X-XX---XX--X-X--X-XXXX--X-XX-X-X--", "X--X---XX-X-X-X----XXX--XX-X-XX-X------X-----XX-XX", "X-X-XX----X-X-X-X----XX--X--X---X-XX-XX-XXXX---X-X", "--X--X-X-X--X-X-XX-XX-XX-XX--X-X-X-XX--X---X-XX-X-", "X--X----X---X-X---X-X--XX--X-X-X-XX-XX--XX--X---XX", "X-X-XXX--XXX--XXXX--XXX-X-X-X-X-X-XX-XX--XX--XX---", "X-XX---XX---XX----X---XX-X----XX-X-X--XX--X-X--XX-", "-X--XXX-X-XX-X-X--X-XX---XXXX--X-X--X---X--X-XX-XX", "X-XX--X--X---X-XXX-X-XXX-----X--X-XX-X-X-XX-X--X-X", "-X-XXX-X-XXX-X----X-X--X-XXXX-X--X-X-X--X---X-X-X-", "-XX--X--X----XX------X--X---X--XX-X--XXX-XX-X--X--", "X-X-X-X-X-XX---XX-XX--X-X-X-XXX-XX-X---XX--X-XX-XX", "XX-X--X--X-X-X--X---XX-X-X-X--XX---XXXX-X-X---XX-X", "-X--X-XXX--X--X---XX-X-X---XX---X-X---X--X-XXX----", "X-XX-X--X--X-X-X-X-X-XX-X---XX--X-X-X-X--XX--XXXXX", "XX-X-XX-X--X----X-X----X-XX--XX-XX-X--X-X--X------", "-X-X----X-X-XXX-X-XXX-X-----X--X-X---X--XX---XX-XX", "X--XXX-X--X---X--X--X-XX-XX-X--X-XXXX-X--X-XX--X-X", "X-X---X-X--XX--XX-XX-X-X---X-X-XX---XX-XX-X-X-X--X", "X---X--X-XX--XX-XX-XX--XXXX--XX-XXXX-X----XX-X-X-X", "X-XX-XX-X-X-X----X---X------X--X-------XXX-XX--X-X", "-X-XX-X-XX--XXXX-XXX--XXX-XX-XX-XXXXXXX--XX-XX-X-X"};
		System.out.println(h.minColors(board));
	}

}