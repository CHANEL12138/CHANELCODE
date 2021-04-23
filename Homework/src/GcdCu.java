public class GcdCu {
    public static void main(String[] args) {
        System.out.println(gcd(11,22,33,44,55));//调用了gcd(int ..numbers)方法
        System.out.println(gcd(48,36,12));//调用了gcd(int ..numbers)方法
        System.out.println(gcd(19,57));//调用了gcd(int n1,int n2)方法
   }

    public static int gcd(int n1, int n2)
    {
        n1 = Math.abs(n1);
        n2 = Math.abs(n2);
        // 找到小的那个数
        int min = Math.min(n1, n2);
        // 初始最大公约数为 1
        int gcd = 1;
        // 穷举, 直接从 2 开始
        for (int i = 2; i <= min; i++) {
            // 如果 i 能被两个数同时约分，则是它们的公约数，但不一定是最大的
            if (n1 % i == 0 && n2 % i == 0) {
                // gcd 从最小的公约数，一直到最大的公约数
                gcd = i;
            }
        }
        return gcd;
    }

    public static int gcd(int...numbers)
    {
        int gcd=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            gcd=gcd(gcd,numbers[(i+1)%numbers.length]);//当前最大公约数与下一位书求最大公约数
        }
        return gcd;
    }
}
