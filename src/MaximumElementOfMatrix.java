
public class MaximumElementOfMatrix {
	
	
	
	
	
	
	
	
	
	
	
	 public static void main(String[] args) { 
	        int[][] arr = new int[][] { {3, 4, 1, 8}, 
	                                    {1, 4, 9, 11}, 
	                                    {76, 34, 21, 1}, 
	                                   {2, 1, 4, 5} }; 
	        maxelement(4, arr);
	    }

	private static void maxelement(int noofrows, int[][] arr) {
		
		for(int i=0;i< noofrows;i++) {

			int max=findMax(arr[i]);
			System.out.println(""+i+"row"+ max);
		}
		
	}

	private static int findMax(int[] arr) {
		
		int MAX=Integer.MIN_VALUE;
		
		for(int i=0;i< arr.length;i++) {
			
			if(arr[i]> MAX) {
				
				MAX=arr[i];
				
			}
			
		}
		
		return MAX;

		
	} 

}
