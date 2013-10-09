public class Hotel {

	public int marketCost(int minCustomers, int[] customers, int[] cost){

		int maxC = 0;
		for(int l=0;l<customers.length;l++){
			int x = (int)Math.ceil(((double)minCustomers/customers[l]))*customers[l];
			if(x>maxC){ maxC= x;}
		}	

		int[] optimums = new int[maxC+1];
		optimums[0] = 0;

		for(int i=1;i<optimums.length;i++){
			int m = 9999999;
			for(int j=0;j<customers.length;j++){
				int p = i-customers[j];
				if(p>=0){
					int c = cost[j] + optimums[p];
					if(c<m){ m = c; }
				}	
			}
			optimums[i] = m;
		}

		for(int i=0;i<optimums.length;i++){
			System.out.println("m["+i+"]: "+optimums[i]);
		}

		int soln = 9999999;
		for(int i = minCustomers; i<optimums.length; i++){
			if(optimums[i]<soln){soln = optimums[i];}
		}
		return soln;
	}

}