import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinimumSwaps {
	
	public static void main(String args[]) {
		
		int arr[]= {1,2, 5,3,4,0, };
		int swaps=minimumSwaps(arr);
		System.out.println(swaps);
		
	}
	
	static int minimumSwaps(int[] arr) {
		
		List<Pair> list=new ArrayList<>();
		
		for(int i=0;i< arr.length;i++) {
			
			Pair p=new Pair(arr[i],i);
			list.add(p);
		}
		
		boolean[] visited=new boolean[arr.length];
		
		list.sort(new Comparator<Pair>() {

			@Override
			public int compare(Pair o1, Pair o2) {
				
				
				if(o1.getValue() > o2.getValue()) {
				return -1;
				
				}
				
				else if(o1.getValue() == o2.getValue()) {
					return 0;
					
				}
				
				else if(o1.getValue() < o2.getValue()) {
					return 1;
					
				}
				
				else {
					
					return 0;
				}
			}
		});
		
		
		int ans=0;
		
		for(int k=0;k< arr.length;k++) {
			
			int cycle=0;
			if(  visited[k] == true  || list.get(k).getIndex() == k ) {
				
				continue;
			}
			
			int j=k;
			
			while(!visited[j]) {
				
				visited[j]=true;
				
				j=list.get(j).getIndex();
				cycle++;
			}
			
			if(cycle > 0) {
				
				ans += (cycle - 1); 
			}
		}
		
		return ans;

    }

}


class Pair {
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	private int value;
	private int index;
	
	Pair(int value, int index){
		this.value=value;
		this.index=index;
	}
	
}
