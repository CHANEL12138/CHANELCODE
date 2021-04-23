import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

    public static void main(String[] args) {
        FileInputStream fl = null;
        FileInputStream fl1 = null;
        FileInputStream fl2 = null;

        byte[] b = new byte[4];


        {
            try {
                fl = new FileInputStream("D:\\aaq");
                fl1 = new FileInputStream("Test");//绝对路径在工程文件根目录下
                fl2 = new FileInputStream("src\\main\\java\\IOLearn\\Test");//相对路径从工程路径开始


//                   while (fl.read()!=-1)
//                   {
//                       System.out.println(fl.read());
//                   }//有问题！！read会一边返回值一边往下指
                int ss;
                while ((ss = fl.read())!=-1)
                {
                    System.out.println(ss);
                }
                int DataCount;
                DataCount = fl1.read(b);
                System.out.println(DataCount);//一次读Byte长度的字节数 现在是4 abcd
                System.out.println(new String(b));
                System.out.println(new String(b,0,DataCount));//读多少转多少

                DataCount = fl1.read(b);
                System.out.println(DataCount);//一次读Byte长度的字节数 现在是4 ef12
                System.out.println(new String(b));
                System.out.println(new String(b,0,DataCount));//读多少转多少


                DataCount = fl1.read(b);
                System.out.println(DataCount);//一次读Byte长度的字节数 现在是1 3f12 //往前覆盖
                System.out.println(new String(b));
                System.out.println(new String(b,0,DataCount));//读多少转多少


                DataCount = fl1.read(b);
                System.out.println(DataCount);//一次读Byte长度的字节数 现在是-1 3f12
                System.out.println(new String(b));
//或 使用循环
                int DataCount1;
                while((DataCount1=fl2.read())!=-1)
                {
                    System.out.println(new String(b,0,DataCount1));
                }







            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fl.close();
                    fl1.close();
                    fl2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
