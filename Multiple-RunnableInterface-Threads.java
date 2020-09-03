//Use of runnable interface in multiple thread..

package multithreading;

public class TestMulRunnable {
    public static void main(String[] args) throws InterruptedException {
        ExR t1,t2,t3;
        t1=new ExR("1st");
        t1.x.start();
        t2 =new ExR("2nd");
        t2.x.start();
        t3=new ExR("3rd");
        t3.x.start();

        for (int i=0;i<10;i++){
            System.out.println("Main Thread.");
            Thread.sleep(1000);
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

