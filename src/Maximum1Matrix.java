import org.omg.CORBA.INTERNAL;

public class Maximum1Matrix {
	
	
	
	
	
	
	public static void main(String[] args) 
    { 
        int mat[][] = { { 0, 0, 0, 1 }, 
                        { 0, 1, 1, 1 }, 
                        { 1, 1, 1, 1 }, 
                        { 0, 0, 0, 0 } }; 
        System.out.println("Index of row with maximum 1s is "
                                            + rowWithMax1s(mat)); 
    }

	private static int rowWithMax1s(int[][] mat) {
		
		int l=mat[0].length;
		int max=Integer.MIN_VALUE;
		int row= -1;
		
		for(int i = 0;i< l;i++) {
			
			int C=find(mat[i], 0, mat[i].length-1);
			int count= C >= 0? (l-C) : 0;
			
			System.out.println(count);
			
			if( count > max) {
				max=count;
				row=i;
			}
			
		}
		
		return row;
		
		
	}

	private static int   find(int[] arr, int l, int h) {
		
		if(l<= h) {
			
			int mid =l+ (h-l)/2;
			
			if(( mid ==0) || (arr[mid-1] == 0 && arr[mid]== 1 )) {
				
				return mid;
				
			} else if( arr[mid] == 0) {
				
				return find(arr, mid+1, h);
				
			}else {
				
				return find(arr, l, mid-1);
			}
			
			
		}
		
		return -1;
		
		
		
		
		
		
		
	} 

}
