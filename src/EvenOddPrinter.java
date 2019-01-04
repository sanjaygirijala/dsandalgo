
public class EvenOddPrinter {
	
	
	public static void main(String args[]) {
		
		EvenOddPrinter ep=new EvenOddPrinter();
		
		Thread t1=new Thread(new EvenProducer(ep));
		Thread t2=new Thread(new OddProducer(ep));
		
		t2.start();
		t1.start();

		
	}
	
	volatile boolean  evenflag=true;
	
	public void printEven(int num) {
		
		synchronized(this){
			
			while(evenflag) {
				
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			System.out.println("E:"+num);
			evenflag=true;
			notify();
			
		}
		
	}
	
    public void printOdd(int num) {
    	
        synchronized(this){
			
			while(!evenflag) {
				
				try {
					wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			System.out.println("O:"+num);
			evenflag=false;
			notify();
			
		}
		
	}
}

class EvenProducer implements Runnable{
	
	private EvenOddPrinter p;
	
	EvenProducer(EvenOddPrinter p){
		this.p=p;
	}

	@Override
	public void run() {

		for(int i=2;i<=100;i=i+2) {
			p.printEven(i);
		}
		
	}
	
	
}

class OddProducer implements Runnable{
	
	private EvenOddPrinter p;
	
	OddProducer(EvenOddPrinter p){
		this.p=p;
	}
	

	@Override
	public void run() {
		
		for(int i=1;i<=100; i=i+2 ) {
			p.printOdd(i);
		}
		
	}
	
	
}
