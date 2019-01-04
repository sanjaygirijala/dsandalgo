
public class RotateArray {
	
	public static void main(String args[]) {
		
		int arr[]= {2,3,4,5,6};
		int noofrotations=2;
		
		
		for(int i=0;i< noofrotations;i++) {
		rotateLeft(arr);
		}
		
        for(int i: arr) {
			
			System.out.println(i);
		}
		
		
	}

	private static int[] rotateLeft(int[] arr) {
		
		int temp=arr[0];
		
		for(int i=0;i< arr.length-1;i++) {
			
			arr[i]= arr[i+1];
			
			
		}
		
		arr[arr.length-1]=temp;
		
		return arr;
		
		
	}

}
