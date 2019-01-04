
public class InsertionSort {
	
	
	public static void main(String args[]) {
		
		int arr[]= {20,10,5,4,3,2,1};
		int a[]=insertionSort(arr);
		
		for(int i=0;i< a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

	private static int[] insertionSort(int[] arr) {
		
		int n=arr.length;
		
		for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
            
            while(j >= 0  && arr[j] > key) {
            	
            	arr[j+1] = arr[j];
                j--;
                
            }
            
            arr[j+1]=key;

        }
		
		return arr;

		
	}

}
