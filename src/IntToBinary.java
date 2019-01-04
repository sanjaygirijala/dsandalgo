
public class IntToBinary {
	
	public static void main(String args[]) {
		
		
		convertToBinary(100);
		
	}
	
	static void convertToBinary(int no){
	    int container[] = new int[100];
	    int i = 0;
	    while (no > 0){
	        container[i] = no%2;
	        i++;
	        no = no/2;
	        System.out.println("==>"+no);
	    }
	    for (int j = i -1 ; j >= 0 ; j--){
	        System.out.print(container[j]);
	       
	    }
	    
	    
	    
	}

}
