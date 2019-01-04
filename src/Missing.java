
public class Missing {
	
	public static void main(String arg[]) {
		
		int arr[]= {1,2,3,5,6,7,8,9};
		System.out.println(getMissingNo(arr, arr.length-1));
	}
	
	static int  getMissingNo(int a[], int n) 
	{
	    int x1 = a[0]; /* For xor of all the elements in array */
	    int x2 = 1; /* For xor of all the elements from 1 to n+1 */
	      
	    for (int i = 1; i< n; i++) 
	        x1 = x1^a[i]; 
	             
	    for ( int j = 2; j <= n+1; j++) 
	        x2 = x2^j;          
	     
	    return (x1^x2); 
	}

}


