import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws Exception {
        //Timer t = new Timer(true);//守护线程，主线程结束守护线程也结束
        Timer t = new Timer();//守护线程，主线程结束守护线程也结束
        SimpleDateFormat sfd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sfd.parse("2021-4-22 19:30:00");


        t.schedule(new Task(),date,1000*10);//执行器TimerTask抽象类对象，开始时间的日期对象，每隔多久执行一次



    }
}

class Task extends TimerTask{

    @Override
    public void run() {
        SimpleDateFormat sfd = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        String str = sfd.format(new Date());
        System.out.println(str+"完成一次备份");
    }
}
