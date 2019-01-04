
import java.util.HashMap;
import java.util.Map;

public class TargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,3,5,6,7};
		int indexes[]=getIndexes(arr, 13);
		System.out.println(indexes[0]);
		System.out.println(indexes[1]);


	}
	
	public static  int[] getIndexes(int arr[], int target){
		
		int result[]=new int[2];
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i< arr.length;i++){
			
			if(map.containsKey(arr[i])){
				int index=map.get(arr[i]);
				result[0]=index;
				result[1]=i;
				break;
				
			}else{
				map.put(target-arr[i], i);
			}
			
		}
		
		return result;
	}

}
