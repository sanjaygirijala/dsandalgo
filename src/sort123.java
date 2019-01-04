
public class sort123 {
	
	
	public static void main(String ar[]) {

		int[] arr= {2,2,2,2,0,1,1,1,0,2,2,1,1,1,1,1,0};
		threewaysorting(arr);
		
		for(int i: arr) {
			System.out.println(i);
		}
	}
	
	public static void threewaysorting(int[] arr) {
		
		int pivot =1;
		int start=0;
		int mid= 0;
		int end=arr.length-1;
		
		
		while(mid <= end) {
			
			if(arr[mid] < pivot) {// 1
				
				swap(arr, start,mid);
				++mid;
				++start;
				
				
			}else if(arr[mid] > pivot) { // 2
				swap(arr, mid, end);
				end--;
				
				
			}else {  // 0
				
				++mid;
				
			}
			
		}
		
	}
	
	private static void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}


	

}
