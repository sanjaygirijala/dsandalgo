
public class Heap {
	
	public int[] array;
	private int heap_type;
	private int count;
	private int capacity;
	
	public Heap(int capacity,int heap_type) {
		
		this.capacity=capacity;
		this.array=new int[capacity];
		this.heap_type=heap_type;
		this.count=0;
	}
	
	public int parent(int i) {
		
		if( i >= count || i < 0) {
			return -1;
		}
		
		return (i-1)/2;
	}
	
	public int leftChild(int i) {
		int left= 2*i+1;
		
		if(left >= count) {
			return -1;
		}
		
		return left;
	}
	
    public int rightChild(int i) {
    	
        int right= 2*i+2;
		
		if(right >= count) {
			return -1;
		}
		
		return right;
		
	}
    
    
    public int getmax() {
    	
    	if(count ==0) {
    		return -1;
    	}
    	
    	return array[0];
    }
    
    
    void percolateDown(int i){
    	
    	int left=leftChild(i);
    	int right=rightChild(i);
    	int max;
    	
    	if(left != -1  && this.array[left] > this.array[i]) {
    		
    		max =left;
    		
    	}else {
    		
    		max=i;
    		
    	}
    	
    	if(right != -1 && this.array[right] > this.array[max]) {
    		
    		max=right;
    		
    	}
    	
    	
    	if(max != i) {
    		
    		swap(max,i);
    		
    	}
    	
    	percolateDown(max);
    }

	private void swap(int i, int j) {
		
		int temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	
	
	private int deleteMax() {
		
		if(this.count ==0) {
			return -1;
		}
		
		int data = this.array[0];
		this.array[0]=this.array[count-1];
		this.count--;
		percolateDown(0);
		return data;
	}
	
	
	public void insertData(int data) {
		
		if(this.count == capacity) {
			  resize();
		}
		
		this.count++;
		int i=count-1;
		
		while(i > 0   && data > this.array[(i-1)/2]) {
 
			        this.array[i]=this.array[i-1/2];
			        i=(i-1)/2;
		}
		
		this.array[i]=data;
		
		
		
	}

	private void resize() {
		// TODO Auto-generated method stub
		
	}

}
