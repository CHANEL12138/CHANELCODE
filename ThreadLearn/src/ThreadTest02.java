public class ThreadTest02 {
    public static void main(String[] args) {

        MyRunnable my = new MyRunnable();
        Thread t = new Thread(my);
        t.start();
        for(int i = 0;i<100;i++)
        {
            System.out.println("Main Thread!>>>>>>" + i);
        }





    }
}

class MyRunnable implements Runnable{//用接口比较多，可以继承其他类
    @Override
    public void run() {
        for(int i = 0;i<100;i++)
        {
            System.out.println("Another Thread!>>>>>>" + i);
        }
    }
}