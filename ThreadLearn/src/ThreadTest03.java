import java.util.Scanner;

public class ThreadTest03 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0;i<40;i++)
                {
                    System.out.println("Another Thread!>>>>>>" + i);
                }
                Scanner s =new Scanner(System.in);
                s.nextInt();
                for(int i = 0;i<40;i++)
                {
                    System.out.println("Another Thread!>>>>>>" + i);
                }
            }
        });
        thread.start();
        for(int i = 0;i<100;i++)
        {
            System.out.println("Main Thread!>>>>>>" + i);
        }




    }
}
