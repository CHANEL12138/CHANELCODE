import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
       String s ="red";
        ArrayList<String> ss = new ArrayList<>();
        ss.add("red");
        ss.add("red");
        ss.add("green");
        for(int i=0;i<ss.size();i++)
        {
            if(ss.get(i).equals("red"))
            {
                ss.remove(i);
            }
        }
        System.out.println(ss);


    }

@Test

    public void Test()
    {
        String a = "abcdef";
        StringBuffer b = new StringBuffer(a);


        if(a.equals(b))
        {
            System.out.println("equals succc");
        }
        if (b.equals(a))
        {
            System.out.println("bssss");
        }

    }
}
