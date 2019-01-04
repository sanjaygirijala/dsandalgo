/** 
 * @author Amit Gupta 
 * 
 */  
class EvenPrinter implements Runnable {  
    private int number = 2;  
    private final Object mutex;  
  
    public EvenPrinter(Object object) {  
        mutex = object;  
    }  
  
    public void run() {  
        for(int i=0;i< 100;i++) {  
            synchronized (mutex) {  
                if(i%2 ==0) {
                	System.out.println(i);
                }
                mutex.notify();  
                try {  
                    mutex.wait();  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
}  
  
class OddPrinter implements Runnable {  
    int oddNumber = 1;  
    private final Object mutex;  
  
    public OddPrinter(Object object) {  
        mutex = object;  
    }  
  
    public void run() {  
    	for(int i=0;i< 100;i++){  
            synchronized (mutex) {  
            	if(i%2 ==1) {
                	System.out.println(i);
                }
                mutex.notify();  
                try {  
                    mutex.wait();  
                } catch (InterruptedException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }  
}  
  
public class DigitPrinter {  
  
    public static void main(String[] args) {  
        Object mutex = new Object();  
        EvenPrinter evenRunnable = new EvenPrinter(mutex);  
        OddPrinter oddRunnable = new OddPrinter(mutex);  
        Thread oddThread = new Thread(oddRunnable, "Odd Printer Thread");  
        Thread evenThread = new Thread(evenRunnable, "Even Printer Thread");  
        oddThread.start();  
        evenThread.start();  
    }  
}  