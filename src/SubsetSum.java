
public class SubsetSum {
	
	
	
	
	
	
	public static void main (String args[]) 
    { 
        int set[] = {3, 34, 40, 12, 5, 20}; 
        int sum = 60; 
        int n = set.length; 
        if (isSubsetSum(set, n, sum) == true) 
            System.out.println("Found a subset"
                          + " with given sum"); 
        else
            System.out.println("No subset with"
                               + " given sum"); 
    }

	private static boolean isSubsetSum(int[] set, int n, int sum) {
		
		
		if(sum==0) {
			return true;
		}
		
		if(n ==0 && sum != 0) {
			return false;
		}
		
		if(set[n-1] > sum) {
			
			isSubsetSum(set, n-1, sum);
			
		}
		
		return isSubsetSum(set, n-1, sum) || isSubsetSum(set, n-1, sum-set[n-1]);
	} 

}
