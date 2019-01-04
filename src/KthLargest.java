
public class KthLargest {
	
	
	public static void main(String args[]){
		
		int k=1	;
		
		int arr[]={1,3,5,33,90,77,45};
		
		int largest=getKthLargest(arr.length-k+1,arr,0,arr.length-1);
		System.out.println(largest);
	}

	private static int getKthLargest(int k, int[] arr, int start , int end) {
		
		int pivot=arr[end];
		
		int left=start;
		int right=end;
		
		while(true){
			  
			
			while(arr[left]< pivot  && left < right){
				
				left++;
			}
			
			while(arr[right] >= pivot && left < right){
				right--;
			}
			
			if(left == right){
				
				break;
			}
			
			
			swap(arr,left,right);
			
			
		}
		
		swap(arr,left,end);
		
		if(k == left+1){
			
			return pivot;
		}
		
		else if( k < left +1){
			
			return getKthLargest(k, arr, start, left -1);
		}
		else {
			
			return getKthLargest(k, arr, left+1, end);
			
		}
		
		
		
		
	}

	private static void swap(int[] arr, int left, int right) {
		
		System.out.println("B==>left"+arr[left]+"right"+arr[right]);
		
		arr[left]=arr[left]^ arr[right];
		arr[right]=arr[left]^ arr[right];
		arr[left]=arr[left]^ arr[right];
		
		System.out.println("A==>left"+arr[left]+"right"+arr[right]);

		

		
	}

}
