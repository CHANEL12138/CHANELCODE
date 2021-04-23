import java.math.BigDecimal;
import java.util.Random;

public class Bigdec {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal(3000);
        BigDecimal b2 = new BigDecimal(3405);
        System.out.println(b1.add(b2));
        Random random = new Random();
        System.out.println(random.nextInt(101));
    }
}
