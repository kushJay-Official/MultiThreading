//this is simple Runnable interface

package multithreading;

public class TestRunnable {
    public static void main(String[] args) throws InterruptedException {
        ExR t= new ExR("One");
        t.x.start();
        for (int i=0;i<5;i++){
            System.out.println("Main Thread..");
            Thread.sleep(800);
        }
    }
}

public class ExR implements Runnable {
    Thread x;
    ExR(String n){
        x=new Thread (this,n);
    }
    @Override
    public void run() {
        for (int i=0;i<5;i++){
            System.out.println(x);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

