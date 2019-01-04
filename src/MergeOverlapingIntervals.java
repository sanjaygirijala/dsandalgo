import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MergeOverlapingIntervals {
	
	public static void main(String args[]) {
		
		Interval arr[]=new Interval[4]; 
	    arr[0]=new Interval(60,80); 
	    arr[1]=new Interval(10,90); 
	    arr[2]=new Interval(2,4); 
	    arr[3]=new Interval(4,7); 
	    
	    
	    mergeIntervals(arr); 
		
	}

	private static void mergeIntervals(Interval[] arr) {
		
		
		// sort by start time desc.
		
		Arrays.sort(arr, new Comparator<Interval>() {

			@Override
			public int compare(Interval o1, Interval o2) {
				return o2.s-o1.s;
			}
			
			
		});
		
		for(Interval s : arr) {
			
			System.out.println(s.s);
		}
		
		int index=0;
		
		for(int i=0;i< arr.length;i++) {
			
			
			// overlapp
			if(index !=0 && arr[index-1].s <= arr[i].e) {
				
				while(index !=0 && arr[index-1].s <= arr[i].e) {
					
					arr[index-1].s= Math.min(arr[index-1].s, arr[i].s);
					arr[index-1].e=Math.max(arr[index-1].e, arr[i].e);
					index--;
					
				}
				
				
				
			}else {// no overlap
				
				arr[index]=arr[i];
				
				
			}
			index++;
			
			
			
		}
		
		System.out.print("The Merged Intervals are: "); 
        for (int i = 0; i < index; i++)  
            System.out.print("["+arr[i].s+","+arr[i].e+"]");  
		
		
		
		
		
	}
	
	
	
	
	
	

}
