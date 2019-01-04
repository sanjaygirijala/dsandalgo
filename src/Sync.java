
public class Sync {
	
	
	public synchronized void  test() {	
		
		System.out.println("Testaa");
		
		try {
			
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Test");
	}
	
    public synchronized void  test1() {
    	
		System.out.println("Test11");

      try {
			
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Test111");
	}
    
    
    public static void main(String args[]) {
    	
    	Sync c=new Sync();

    	
    	Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				c.test();
				
			}
		});
    	
       Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				c.test1();
				
			}
		});
       
       
       
       t2.start();
       t1.start();
       
    	
    	
    	
    	
    	
    	
    }

}
