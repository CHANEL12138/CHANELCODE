public class ThreadTest {
    public static void main(String[] args) {
        Myclass ms = new Myclass();
        MyThread mc = new MyThread(ms);
        mc.setName("t1");
        MyThread mc1 = new MyThread(ms);
        mc1.setName("t2");
        mc.start();
        mc1.start();


        System.out.println("Main>>>>>end");
    }
}

class MyThread extends Thread{
    private Myclass ms;
    public MyThread(Myclass ms)
    {
        this.ms=ms;
    }

    @Override
    public void run() {
        if(Thread.currentThread().getName().equals("t1"))
        {
            ms.doSome();
        }
        if(Thread.currentThread().getName().equals("t2"))
        {
            ms.doOther();
        }

    }
}

class Myclass{
    public synchronized void doSome()//synchronized关键字加到方法体上的拿的锁是this
    {
        System.out.println("Dosome>>>>>>>>start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Dosome>>>>>>>>end");
    }
    public synchronized static void doOther()//加到静态方法上时，拿到的是类锁
    {
        System.out.println("Doother>>>>>>>start");

        System.out.println("Doother>>>>>>>end");
    }
}