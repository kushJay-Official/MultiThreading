//this is first simple thread

package multithreading;

public class TestThreadII {
    public static void main(String[] args) throws InterruptedException {
        Ext e=new Ext();
        e.start();
        e.setName("1st");
        for (int i=0;i<10;i++){
            System.out.println("Main Thread..");
            Thread.sleep(1000);
        }
    }
}

public class Ext extends Thread {
    public void run(){
        try {
            Thread t;
            t=Thread.currentThread();
            String s=t.getName();
            for (int i=0;i<15;i++){
             System.out.println(s);
             Thread.sleep(400);
            }
        } catch (Exception e) {}
    }
}
