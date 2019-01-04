
public class Frequency {
	
	public static void main(String args[]) {
		
		int NO_OF_CHARS=256;
		
		String str="aabababaccccccccccccccggggggjjjjjjjjjjjjjjjjjj";
		char[] charArr=str.toCharArray();
		int[] count=new int[NO_OF_CHARS];
		
		for(int i=0;i< charArr.length;i++) {
			
			count[(int)charArr[i]]++;
		}
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		
       for(int j=0;j< NO_OF_CHARS;j++) {
			
    	   if(count[j] > first) {
    		   second=first;
    		   first=count[j];
    	   }else{ if(count[j] > second) {
    		   second = count[j];
    	   }
 			
		}
	}
       
       System.out.println(second);
       
	}

}
