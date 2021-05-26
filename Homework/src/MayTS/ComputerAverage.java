package MayTS;

public class ComputerAverage {
    public void giveAver(double [] b) {
        double sum=0;
        for(int i =0;i<b.length;i++) {
            sum = sum+ b[i];
        }
        double aver=sum/b.length;
        System.out.print("选手最后得分"+aver);
    }
}
