

public class BinarySearch {
	
	public static void main(String args[]){
		
		int arr[]={2,8,16,23,39,41,77};
		int arr2[]={88,90,2,8,16,23,39,41,77};

		//System.out.println("index of "+binarySearch(arr, 2,0,arr.length));
		System.out.println("cyclic sorted index"+search(arr2,77,0,arr2.length-1));
	}

	private static   int search(int[] arr2, int num, int low, int high) {
	
		while (low <= high) {

			int mid = (high + low) / 2;

			if (arr2[mid] == num) {

				return mid;
			}

			if (arr2[mid] <=arr2[high]) // second half sorted
			{

				if (num > arr2[mid] && num <= arr2[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}

			}

			else  // first half sorted
			{

				if (num < arr2[mid] && num >= arr2[low]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}

			}

		}
		
		
		return -1;
		
		
		
	}

	private static int binarySearch(int[] arr,int num, int low,int high) {
		
		
		while(low <= high){
			
		
		int mid=(high+low)/2;
		
		if(arr[mid]== num){
			
			return mid;
		}
		
		if(num < arr[mid] ){
			
			high= mid -1;
			
			
		}else{
			low=mid+1;
		}
		
		}
		
		
		return num;
		
	}

}
