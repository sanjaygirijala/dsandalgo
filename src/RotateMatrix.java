
public class RotateMatrix {
	
	
	public  static  boolean rotate(int[][] mat){
		
		int N=mat.length;
		
		// Consider all squares one by one 
        for (int x = 0; x < N / 2; x++) 
        { 
            // Consider elements in group of 4 in  
            // current square 
            for (int y = x; y < N-x-1; y++) 
            { 
                // store current cell in temp variable 
                int temp = mat[x][y];
                System.out.println("x:"+x+"y:"+y);
       
                // move values from right to top 
                mat[x][y] = mat[y][N-1-x]; 
                
                System.out.println("y:"+y+"N-1-x:"+(N-1-x));

       
                // move values from bottom to right 
                mat[y][N-1-x] = mat[N-1-x][N-1-y]; 
                System.out.println("N-1-x:"+(N-1-x)+"N-1-y:"+(N-1-y));

       
                // move values from left to bottom 
                mat[N-1-x][N-1-y] = mat[N-1-y][x]; 
                
                System.out.println("N-1-y:"+(N-1-y)+"x:"+(x));
       
                // assign temp to left 
                mat[N-1-y][x] = temp; 
            } 
        } 
        
        return true;
		
	}
	
	public static void main (String[] args)  
    { 
        int N = 4; 
          
        // Test Case 1 
        int mat[][] = 
        { 
            {1, 2, 3, 4}, 
            {5, 6, 7, 8}, 
            {9, 10, 11, 12}, 
            {13, 14, 15, 16} 
        }; 
        
        rotate(mat);
        
    }

}
