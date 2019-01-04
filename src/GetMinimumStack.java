
import java.util.Stack;

public class GetMinimumStack {
	
	public static void main(String args[]){
		
		Stack<Integer> main=CreateMainStack();
		Stack<Integer> minimum=CreateMinimumStack();
		
		add(10,main,minimum);
		add(2,main,minimum);
		add(4,main,minimum);
		add(4,main,minimum);
		add(1,main,minimum);
		
		pop(main,minimum);
		
		System.out.println(minimum.peek());
		
		
		
	}

	private static int pop(Stack<Integer> main, Stack<Integer> minimum) {
		
		int value=main.pop();
		minimum.pop();
		
		return value;
	}

	private static void add(int num, Stack<Integer> main, Stack<Integer> minimum) {
		
		if(main.size()==0){
			
			main.push(num);
			minimum.push(num);
			
		}else{
			
			main.push(num);
			
			int top=minimum.peek();
			if(top < num){
				minimum.push(top);
			}
			
		}
		
		
		
	}

	private static Stack<Integer> CreateMinimumStack() {
		
		return new Stack<Integer>();
		
	}

	private static Stack<Integer> CreateMainStack() {
		
		return new Stack<Integer>();
		
		
	}

}
