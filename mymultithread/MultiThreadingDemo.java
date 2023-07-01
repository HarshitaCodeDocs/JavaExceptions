package mymultithread;

class A extends Thread {
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hi...");
            
            //sleep()-ask your thread to wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace();
        }
        }
    }
}
class B extends Thread {
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hello...");

             //sleep()-ask your thread to wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace();
        }
        }
    }
}
public class MultiThreadingDemo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        //Thread priority
        System.out.println(obj1.getPriority());

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
         
        obj2.start();
    }
    
}