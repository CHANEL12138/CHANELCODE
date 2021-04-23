public class ArrayCopyLearn {
    public static void main(String[] args) {
        char[] a ={'a','b','c','d'};
        char[] b =new char[5];
        System.arraycopy(a,0,b,0,a.length);
        for(int i=0;i<4;i++)
        {
            System.out.println(a[i]);
        }
            System.out.println(b);
    }
}
