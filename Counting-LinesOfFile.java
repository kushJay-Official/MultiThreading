//In this Program we are going to count the no of lines in a text file and print total time 

package multithreading;

import java.io.*;
public class ByMultiThread {
    public static void main(String[] args) throws InterruptedException {
        String s[]={"/media/jay/kush.Official/TestJava-II/src/multithreading/a.txt","/media/jay/kush.Official/TestJava-II/src/multithreading/b.txt","/media/jay/kush.Official/TestJava-II/src/multithreading/c.txt"};
        double b1,c,a=System.currentTimeMillis();
        System.out.println("Starting Time...."+System.currentTimeMillis());

        LineCh t[]=new LineCh[s.length];
        for (int i=0;i<s.length;i++){
            t[i]=new LineCh(s[i]);
            t[i].start();
        }
        for (int i=0;i<s.length;i++)
            t[i].join();
        b1=System.currentTimeMillis();
        c=b1-a;
        System.out.println("Ending Time... "+System.currentTimeMillis()+"\nTotal Time Acquired  "+c);

    }
}

public class LineCh extends Thread {
    private String fname;
    public LineCh(String st){
        fname=st;
    }
    public void run(){
        try {
            FileReader fr=new FileReader(fname);
            BufferedReader b=new BufferedReader(fr);
            LineNumberReader l=new LineNumberReader(b);

            while (l.readLine()!=null)
                Thread.sleep(10);
            System.out.println("Lines "+fname+":    "+l.getLineNumber());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
