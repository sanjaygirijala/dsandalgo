
/*
 * http://www.geeksforgeeks.org/find-the-maximum-subarray-xor-in-a-given-array/
 */
public class MaxSubArrayXOR {
	
	public static void main(String args[]){
		
		int arr[] = {1, 2, 3, 4};
		int maxsubArrayXOR=maxSubArrayXor(arr);
		System.out.println(maxsubArrayXOR);
	}

	private static int maxSubArrayXor(int[] arr) {
		
		int maxXor=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			
			int curXor=arr[i];
			
			for(int j=i;j<arr.length;j++){
				
				curXor=curXor^arr[j];
				maxXor=max(curXor,maxXor);
				
				
			}
			
		}
		
		return maxXor;
		
		
	}

	private static int max(int one, int two) {

		if(one == two){
			return one;
		}
		if(one > two){
			return one;
		}else{
			return two;
		}
		
		
	}

}
