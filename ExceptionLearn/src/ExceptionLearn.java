import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/*
1、编译时异常：父类是Exception的子类，必须处理
2、运行时异常：父类是RuntimeException,一般不需要在程序里处理
3、重写方法时，父类要比子类抛出更多或者更宽的异常，子类可以不抛出异常。


try catch finally 异常捕捉
throws 在声明位置使用，表示上报异常信息给调用者
throw  手动抛出异常
 */
public class ExceptionLearn {
    //如果在主函数上报异常，那么jvm会终止程序
    public static void main(String[] args) {
        System.out.println("Main start!");
        m1();
        FinallyL();
        try {
            Myex(20);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Main end");
    }

    private static void m1() {
        System.out.println("m1 start");
        try{
            m2();
            System.out.println("有异常，这句话不会输出");
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("m1 end");
    }

    private static void m2() throws FileNotFoundException {
        //对父类又抛出异常的，
        //向上抛出异常
        //用try..catch块接住异常
        new FileOutputStream("/des/de.txt");
    }

    public static void FinallyL() {
        try{
            m1();
            return;
        }finally {
            System.out.println("finally语句执行");
        }
        // 如果有try..finally，一定会在try结束前
        // 先执行finally语句里面的语句
        //常用于关闭或释放某些资源
    }
    //一面试题
    public static int doSome() {
        int i = 100;
        try{
            return i;
        }finally {
            i++;
        }
    }
    //在finally之中的语句虽然先执行，
    // 但是java要满足方法体内要从上到下执行，所以返回100
    public static void Myex(int a) throws MyException {
        if(a>10) throw new MyException("a大于十！！");
    }
}
