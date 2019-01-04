
public class SmallestAndLargestofSqDiagnol {
	
	
	// Driver code 
    static public void main(String[] args) 
    { 
  
        // Declare and initialize 5X5 matrix 
        int[][] matrix = { 
            { 1, 2, 3, 4, -10 }, 
            { 5, 6, 7, 8, 6 }, 
            { 1, 2, 11, 3, 4 }, 
            { 5, 6, 70, 5, 8 }, 
            { 4, 9, 7, 1, -5 } 
        }; 
  
        diagonalsMinMax(matrix); 
    }

	private static void diagonalsMinMax(int[][] arr) {
		
		int diaMax=Integer.MIN_VALUE;
		int diaMin=Integer.MAX_VALUE;
		
		int secMax=Integer.MIN_VALUE;
		int secMin=Integer.MAX_VALUE;
		
		
		for(int i=0;i< arr[0].length;i++) {
			
			for(int j=0;j< arr[0].length;j++) {
				
				if(i == j) {
					
					if(arr[i][j] > diaMax ){
						diaMax=arr[i][j];
					}
					
					if(arr[i][j] < diaMax ){
						diaMin=arr[i][j];
					}
					
					
					
				}
				
				if(i+j == arr[0].length-1) {
					
					
					if(arr[i][j] > secMax ){
						secMax=arr[i][j];
					}
					
					if(arr[i][j] < secMin ){
						secMin=arr[i][j];
					}
					
				}
				
			}
			
		}
		
		System.out.println("mx"+diaMax);
		System.out.println("mn"+diaMin);
		
		System.out.println("mx"+secMax);
		System.out.println("mn"+secMin);


		
	} 

}
