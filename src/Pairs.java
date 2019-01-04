import java.util.HashMap;
import java.util.Map;

public class Pairs {
	
	public static void main(String args[]) {
	
	int[] arr1= {1,2,3,4,5};
	int[] arr2= {3,4,5,6,7,8};
	
	int sum= 10;
	
	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
	
	for(int i=0;i< arr1.length;i++) {
		
	    map.put(arr1[i], 0);
	    
	}
	
	
	for(int i=0;i< arr2.length;i++) {
	
		if(map.containsKey(sum-arr2[i])) {
			
			System.out.println(""+(sum-arr2[i])+"pp"+arr2[i]);
			
		}
	
		
	}
	
	}
	

}
