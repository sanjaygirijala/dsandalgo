
public class secondlargest {
	
	
	public static void main(String args[]) {
		
		int first= Integer.MIN_VALUE;
		int second= Integer.MIN_VALUE;

		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		for(int i=0; i< arr.length;i++) {
			
			if(arr[i] > first) {
				
				second=first;
				first=arr[i];
			}
			
			else if(arr[i] > second) {
				second=arr[i];
				
			}
			
		}
		
		
		System.out.println("first, second"+first+","+second);
		
		
	}

}
