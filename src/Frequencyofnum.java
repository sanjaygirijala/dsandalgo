import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequencyofnum {
	
	public static void main(String args[]) {
		
		int[] arr= {1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,22,2222,2222,300000};
		
		Map<Integer,Integer> map=new HashMap<>();
		
		findFrequency(arr, 0, arr.length-1, map);
		
	     for(Entry<Integer, Integer> entry : map.entrySet()) {
	    	 
	    	 System.out.println(entry.getKey()+":"+entry.getValue());
	     }
		
		
	}

	private static void findFrequency(int[] arr, int left, int right, Map<Integer, Integer> map) {

		if(right < left) return;
		
		if( arr[left] == arr[right] ) {
			
			Integer count=map.get(arr[left]);
			
			if(count ==null) {
				count =0;
			}
				
		    map.put(arr[left],count +(right-left)+1	);
			
			return;
		}
		
		int mid =  ( left+right)/2;
		
		findFrequency(arr,left,mid, map);
		findFrequency(arr, mid+1,right, map);
	}
}
