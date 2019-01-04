
public class ClosestPair {
	
	public static void main(String args[]){
		
		int arr1[] = {1, 4, 5, 7};
        int arr2[] = {10, 20, 30, 40};
		int[] result=closestPair(arr1,arr2,22);
		int[] result1=closestPair1(arr1,arr2,22);
		System.out.println("Index 1:"+arr1[result[0]]+"index 2:"+arr2[result[1]]);
		System.out.println("Index 1:"+arr1[result1[0]]+"index 2:"+arr2[result1[1]]);
	}
	
	private static int[] closestPair1(int[] arr1, int[] arr2, int k){
		
		int[] res=new int[2];
		
		int l=0;
		int r=arr2.length-1;
		
		int diff= Integer.MAX_VALUE;
		
		while(l < r && r> 0) {
			
			if( Math.abs(arr1[l]+ arr2[r]- k) < diff) {
				 
				res[0]=l;
				res[1]=r;
				diff = Math.abs(arr1[l]+ arr2[r]- k);
			}
			
			if(arr1[l] + arr2[r] > k) {
				r--;
			}else {
				l++;
			}
			
		}
		return res;
		
	}

	private static int[] closestPair(int[] arr1, int[] arr2, int k) {

		int result[]=new int[2];
		
		int diff=Integer.MAX_VALUE;
		
		for(int i=0;i<arr1.length;i++){
			
			for(int j=i;j<arr2.length;j++){
				
				if( Math.abs((arr1[i]+arr2[j])-k) < diff ){
					
					diff=Math.abs((arr1[i]+arr2[j])-k);
					result[0]=i;
					result[1]=j;
					
				}
				
			}
			
		}
		
		return result;
		
	}

	private static int min(int a, int b) {
		
		if(a==b){
			return a;
			
		}else if(a< b){
			return a;
		}else{
			return b;
		}
		
	}

}
