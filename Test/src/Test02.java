import java.math.BigDecimal;

public class Test02 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(20);
        BigDecimal b = new BigDecimal("31.65");
        BigDecimal c = a.min(b);
        System.out.println(c);




    }
}
