
public class ArrayUtils {
	
	public static void main(String args[]){
		
		int[] arr={100,2,88,554,7,91};
		
		int minDistance=getMinimumDistanceValue(arr);
		System.out.println(minDistance);
		largestAndSmallest(arr);
		reverseInt(345);

		
	}
	
	private static void reverseInt(int num) {
		
		int reverse=0;
		
		while(num > 0){

			int remainder=num%10;
			num=num/10;
			reverse=reverse*10+remainder;
			
			System.out.println("num"+num+"rem"+remainder+"rev"+reverse);
			
		}
		
		System.out.println(reverse);
		
		
		
		
		
	}

	public static void largestAndSmallest(int arr[]){
		
		int largest=Integer.MIN_VALUE;
		int smallest=Integer.MAX_VALUE;

		
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i] > largest){
				largest=arr[i];
			}
			
			if(arr[i] < smallest){
				smallest=arr[i];
			}
			
		}
		
		System.out.println("largest and smallest"+largest+":"+smallest);
		
		
		
	}

	
	
	public static int getMinimumDistanceValue(int arr[]){
		
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			
			for(int j=i+1;j<arr.length;j++){
				
				if(Math.abs(arr[i]-arr[j]) < min){
					min=Math.abs(arr[i]-arr[j]);
				}

				
			}
			
		}
		
		return min;
	}

}
