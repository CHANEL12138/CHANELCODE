/*
关于线程的sleep方法：
    static void sleep(long millis)
    1、静态方法：Thread.sleep(1000);
    2、参数是毫秒
    3、作用：让当前线程进入休眠，进入“阻塞状态”，放弃占有CPU时间片，让给其它线程使用。
        这行代码出现在A线程中，A线程就会进入休眠。
        这行代码出现在B线程中，B线程就会进入休眠。
    4、Thread.sleep()方法，可以做到这种效果：//静态方法，实例对象调用的话也是表示当前线程而不是对象线程 Thread.currentThread();同理
        间隔特定的时间，去执行一段特定的代码，每隔多久执行一次。
 */
public class ThreadTest04 {
    public static void main(String[] args) {


        Mythread1 mythread = new Mythread1();
        Thread thread = new Thread(mythread);
        thread.setName("new Thread");
        thread.start();


        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" >>>>> "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Mythread1 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" >>>>> "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


