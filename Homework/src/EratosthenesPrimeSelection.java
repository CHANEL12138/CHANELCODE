public class EratosthenesPrimeSelection {
    static boolean b[]= new boolean[101];
    static int result[]=new int[101];
    public static void Print(Object ob)
    {
        System.out.print(ob+" ");
    }
    public static void main(String[] args)
    {
        for(int i=0;i<b.length;i++)
        b[i]=true;
        for(int i=2;i<101;i++)
        {
            if(b[i])
            {
                for(int j=i*2;j<101;j+=i)
                    b[j]=false;
            }
        }
        int s=0;
        for(int i=2;i<101;i++)
        {
            if(b[i])
            {
                result[s] = i;
                s++;
            }
        }
        for(int i:result)
        {
            if(i==0)break;
            Print(i);
        }
    }
}
