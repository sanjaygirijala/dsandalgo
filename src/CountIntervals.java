
public class CountIntervals {
	
	
	
	private static void countIntervals(int arr[][], int v, int n) {
		
		int count=0;
		
		for(int i=0; i< n;i++) {
			
			int l=arr[i][0];
			int r=arr[i][1];
			
			if(v >= l && v <= r) {
				
				count++;
				
			}
		}
		
		System.out.println(count);
		
		
		
		
	}
	
	public static void main(String args[]) {
		
		int[][] arr = { { 1, 10 }, { 5, 10 },  
		         { 15, 25 }, { 7, 12 }, { 20, 25 } }; 
		  
		        int V = 7; 
		  
		        // length of the array 
		        int N = arr.length; 
		        
		        System.out.println(N);
		        
		        countIntervals(arr, V, N);
		        
		 
		
		
		
		
	}

}
