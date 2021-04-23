import java.util.ArrayList;
import java.util.List;

public class ThreadWaitNotify {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread thread1 = new Thread(new Producer(list));
        Thread thread2 = new Thread(new Customer(list));
        thread1.setName("Producer");
        thread2.setName("Customer");
        thread1.start();
        thread2.start();








    }
}

//生产者
class Producer implements Runnable{
    private List list;
    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true)
        {
            synchronized (list)
            {
                if(list.size()>0)
                {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName()+"  >>>>>" +obj);
                list.notifyAll();
            }
        }
    }
}


//消费者
class Customer implements Runnable{
    private List list;
    public Customer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true)
        {
            synchronized (list) {
                if (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = list.remove(0);
                System.out.println(Thread.currentThread().getName()+"  >>>>>" +obj);
                list.notifyAll();

            }
        }
    }
}