
public class MaxDepth {

	public static void main(String[] args) {

		String str="";
		int currentmax=0;
		int max=0;
		
		
		for(int i=0; i< str.length();i++) {
			
			
			if( str.charAt(i) =='(') {
				
				currentmax++;
				if(currentmax > max) {
					
					max=currentmax;
				}
				
				
			}else if( str.charAt(i) ==')') {
				
				if (currentmax>0) 
					currentmax--; 
	            else
	                max= -1; 
				
			}
			
			
		}
		
		if (currentmax != 0) 
			max = -1; 
		
		System.out.println("max"+max+"curmax"+currentmax);
		
		
	}

}
