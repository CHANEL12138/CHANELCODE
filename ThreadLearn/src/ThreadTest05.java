/*
线程终止的三种方法



 */
public class ThreadTest05 {
    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        Thread t = new Thread(myThread3);
        t.setName("MyThread3");
        t.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //t.interrupt();//第一种方法,让sleep方法出异常，catch过后，下面的for循环继续执行
        //t.stop();//第二种方法，直接杀线程
        MyThread4 myThread4 = new MyThread4();
        Thread thread1 = new Thread(myThread4);
        thread1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread4.run=false;//第三种常用
        System.out.println("Main ends>>>>>>>");
    }
}

class MyThread3 implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i<10;i++)
        {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+">>>>>>>>"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class MyThread4 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
            for(int i=0;i<10;i++)
            {
                if(run)
                {
                    try {
                        Thread.sleep(1000);
                        System.out.println("MyThread4>>>>>>>>>"+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();//这里只能trycatch，不能往外抛，因为子类不能抛比父类更宽的异常

                    }
                }
                else
                {
                    System.out.println("MyThread4 ends>>>>>>");
                    //文件处理后结束线程
                    return ;
                }
            }
    }
}
