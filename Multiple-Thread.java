//this is multiple threading program..

package multithreading;

public class TestThreadMul {
    public static void main(String[] args) {
        Ext e1=new Ext();
        e1.start();
        e1.setName("1st");

        Ext e2= new Ext();
        e2.start();
        e2.setName("2nd");

        Ext e3=new Ext();
        e3.start();
        e3.setName("3rd");
        try{
            for (int i=0;i<5;i++){
                System.out.println("Main Thread....");
                Thread.sleep(1000);
            }
        } catch (Exception e) { }
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
