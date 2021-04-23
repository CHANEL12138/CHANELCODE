public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.setName("Name");//默认为Thread-*（0-n）
        System.out.println(myThread.getName());



        for(int i = 0 ;i<100;i++)
        {
            System.out.println("Main Thread!>>>>>>" + i);
        }

        Thread th = Thread.currentThread();
        System.out.println(th.getName());//拿到当前线程





    }


}

class MyThread extends Thread{
    @Override
    public void run() {
        for(int i = 0;i<100;i++)
        {
            System.out.println("Another Thread!>>>>>>" + i);
        }
    }
}