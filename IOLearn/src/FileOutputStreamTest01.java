import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
      FileOutputStream fl = null;
      FileOutputStream fl2 = null;
        try {
            fl = new FileOutputStream("src/main/java/IOLearn/TestOut01",true);//append为true表示在末尾添加，否则就是清空文件重写
            byte[] b = {97,98,99,100,101,102,103,104} ;
            fl.write(b);



            fl2 = new FileOutputStream("src/main/java/IOLearn/TestOut02");//清空
            String s = "好家伙！！";
            fl2.write(s.getBytes(),0,9);//byte数组的第0到第9位写入
            //Java中在不同的编码格式占字节数是不同的，UTF-8编码下一个中文所占字节也是不确定的，可能是2个、3个、4个字节；





            fl.flush();//用完记得刷新！！！
            fl2.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fl!=null&&fl2!=null) {//一起try的话如果fl异常，fl2就关不了了
                try {
                    fl.close();
                    fl2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
