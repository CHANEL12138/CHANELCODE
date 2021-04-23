import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类的其它常用方法：
    int available()：返回流当中剩余的没有读到的字节数量
    long skip(long n)：跳过几个字节不读。
 */
public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream it = null;
        FileInputStream it1 = null;
        FileInputStream it2 = null;
        try {
            it = new FileInputStream("Test");
            System.out.println(it.available());//还有多少可以读
            int Data = it.read();
            System.out.println(Data);
            Data = it.read();
            System.out.println(Data);
            System.out.println(it.available());//还有多少可以读

            it1 = new FileInputStream("Test");
            byte[] b = new byte[it1.available()];//用长度创建数组
            int DataCount = it1.read(b);
            System.out.println(DataCount);
            String s = new String(b);
            System.out.println(s);

            it2 = new FileInputStream("Test");
            it2.skip(3);
            System.out.println(it2.read());




        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try
            {
                it.close();
                it1.close();
                it2.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
